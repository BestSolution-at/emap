package test.junit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import org.dbunit.Assertion;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;
import at.bestsolution.persistence.java.JavaSession;
import junit.framework.Assert;
import test.model.emap.mixedkeys.MAddressMapper;
import test.model.emap.mixedkeys.MPersonMapper;
import test.model.emap.mixedkeys.MPlaceMapper;
import test.model.emap.mixedkeys.MTagMapper;
import test.model.emap.test.PersonMapper;
import test.model.mixedkeys.Address;
import test.model.mixedkeys.Person;
import test.model.mixedkeys.Place;
import test.model.mixedkeys.Tag;
import test.model.test.TestFactory;
import test.model.mixedkeys.MixedkeysFactory;

@RunWith(Parameterized.class)
public class MTestCase {

	private Connection testConnection;
	private IDatabaseConnection dbUnitConn;
	
	@Parameters(name = "Database: {0}")
	public static Collection<String> database() {
		return Arrays.asList(System.getenv("EMAP_DBS").split(","));
	}
	
	@Parameter
	public String database;
	
	private Session session;
	
	private SessionFactory sf;
	protected SessionFactory getSessionFactory() {
		if (sf == null) {
			BundleContext bc = FrameworkUtil.getBundle(MTestCase.class).getBundleContext();
			ServiceReference<SessionFactory> ref = bc.getServiceReference(SessionFactory.class);
			sf = bc.getService(ref);
		}
		return sf;
	}
	
	@Before
	public void before() throws Exception {
		System.err.println("Setting up database " + database);
		session = getSessionFactory().createSession(database);
		
		testConnection = ((JavaSession)session).checkoutConnection();
		try {
			dbUnitConn = new DatabaseConnection(testConnection);
		} catch (DatabaseUnitException e1) {
			e1.printStackTrace(System.out);
			throw e1;
		}
		System.out.println("Session: " + session);
		try (Reader reader = openCreateDDL(session.getDatabaseType())){
			executeScript(reader);
		}
		catch (IOException e) {
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	@After
	public void after() throws Exception {
		System.err.println("Cleaning up database " + database);
		try (Reader reader = openDropDDL(session.getDatabaseType())){
			executeScript(reader);
		}
		catch (IOException e) {
			e.printStackTrace(System.out);
			throw e;
		}
		
		((JavaSession)session).returnConnection(testConnection);
	}
	
	private void executeScript(final Reader scriptReader) {
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				Connection conn = ((JavaSession) s).checkoutConnection();
				try {
					ScriptRunner runner = new ScriptRunner(conn, false, true);
					runner.runScript(scriptReader);
					return true;
				}
				catch (SQLException e) {
					e.printStackTrace(System.out);
					throw new RuntimeException(e);
				}
				catch (IOException e) {
					e.printStackTrace(System.out);
					throw new RuntimeException(e);
				}
				finally {
					((JavaSession) s).returnConnection(conn);
				}
				//return false;
			}
		});
	}
	
	
	private Reader openCreateDDL(String databaseType) throws IOException {
		String path = "/ddls/create_" + databaseType + ".sql";
		System.out.println("path is " + path);
		URL resource = MAddressMapper.class.getResource(path);
		System.out.println("resource = " + resource);
		InputStream in = resource.openStream();
		BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		return r;
	}
	
	private Reader openDropDDL(String databaseType) throws IOException {
		String path = "/ddls/drop_" + databaseType + ".sql";
		System.out.println("path is " + path);
		URL resource = MAddressMapper.class.getResource(path);
		System.out.println("resource = " + resource);
		InputStream in = resource.openStream();
		BufferedReader r = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		return r;
	}
	
	protected IDatabaseConnection getConnection() {
		return dbUnitConn;
	}
	
	protected IDataSet getDBDataSet() throws SQLException {
		return getConnection().createDataSet();
	}
	
	protected IDataSet getXmlDataSet(String name) throws DataSetException {
		return new FlatXmlDataSetBuilder().build(getClass().getResource(name));
	}
	
	@Test
	public void insert() throws Exception {
		
		final Person person0 = MixedkeysFactory.eINSTANCE.createPerson();
		person0.setName("Heinzi");
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.persist(person0);
				return true;
			}
		});
		
        Assertion.assertEquals(getXmlDataSet("onlyHeinziM.xml"), getDBDataSet());
	}
	
	@Test 
	public void delete() throws Exception {
		
		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getXmlDataSet("onlyHeinziM.xml"));
		
		MPersonMapper m = session.createMapper(MPersonMapper.class);
		final Person person0 = m.selectById("1");
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.delete(person0);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("emptyDB.xml"), getDBDataSet());
	}
	
	@Test
	public void insertOneToMany() throws Exception {

		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getXmlDataSet("onlyHeinziM.xml"));
		
		MPersonMapper m = session.createMapper(MPersonMapper.class);
		final Person person0 = m.selectById("1");
		
		org.junit.Assert.assertNotNull(person0);
		
		final Address addr0 = MixedkeysFactory.eINSTANCE.createAddress();
		addr0.setStreet("Street Zero");
		addr0.setPerson(person0);
		
		final Address addr1 = MixedkeysFactory.eINSTANCE.createAddress();
		addr1.setStreet("Street One");
		addr1.setPerson(person0);
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.persist(addr0, addr1);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("heinziWith2AddrM.xml"), getDBDataSet());
	}
	
	@Test
	public void deleteOnToMany() throws Exception {
		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getXmlDataSet("heinziWith2AddrM.xml"));
		
		MPersonMapper personMapper = session.createMapper(MPersonMapper.class);
		Person heinzi = personMapper.selectById("1");
		final Address addr0 = heinzi.getAddresses().get(0);
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.delete(addr0);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("heinziWith1AddrM.xml"), getDBDataSet());
	}
	
	@Test
	public void insertManyToMany() throws Exception {
		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getXmlDataSet("2Person2PlacesM.xml"));
		
		MPersonMapper personMapper = session.createMapper(MPersonMapper.class);
		final Person heinzi = personMapper.selectById("1");
		final Person sarah = personMapper.selectById("2");
		
		MPlaceMapper placeMapper = session.createMapper(MPlaceMapper.class);
		final Place magicalForest = placeMapper.selectById(1);
		final Place wonderland = placeMapper.selectById(2);
		
		heinzi.getLikes().add(wonderland);
		
		sarah.getLikes().add(magicalForest);
		sarah.getLikes().add(wonderland);
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.persist(heinzi, sarah, magicalForest, wonderland);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("2Person2Places3LikesM.xml"), getDBDataSet());
	}
	
	@Test
	public void deleteManyToMany() throws Exception {
		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getXmlDataSet("2Person2Places3LikesM.xml"));
		
		MPersonMapper personMapper = session.createMapper(MPersonMapper.class);
		final Person sarah = personMapper.selectById("2");
		
		MPlaceMapper placeMapper = session.createMapper(MPlaceMapper.class);
		final Place wonderland = placeMapper.selectById(2);
		
		wonderland.getLikedBy().remove(sarah);
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.persist(sarah, wonderland);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("2Person2Places2LikesM.xml"), getDBDataSet());
	}
	
	@Test
	public void testBigInteger() throws Exception {
		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getXmlDataSet("heinziWithBigAddrM.xml"));
		
		MPersonMapper m = session.createMapper(MPersonMapper.class);
		final Person person0 = m.selectById("1");
		
		
		final Tag t0 = MixedkeysFactory.eINSTANCE.createTag();
		t0.setEndlessInt(new BigInteger("1234567890987654321234567890987654321234567890987654321234567890"));
		t0.setValue("Yeah");
		
		person0.getAddresses().get(0).getTags().add(t0);
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.persist(t0);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("heinziWithBigAddrM_1.xml"), getDBDataSet());
		
		MTagMapper tagMapper = session.createMapper(MTagMapper.class);
		final Tag one = tagMapper.selectById(BigInteger.ONE);
		System.err.println(one);
		
		one.setEndlessInt(new BigInteger("77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777"));
		
		session.runInTransaction(new Session.TransactionTask() {
			@Override
			public boolean run(Session s) {
				session.persist(one);
				return true;
			}
		});
		
		Assertion.assertEquals(getXmlDataSet("heinziWithBigAddrM_2.xml"), getDBDataSet());
		System.err.println(t0.getId());

	}
}
