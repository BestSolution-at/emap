package test.junit;

import org.dbunit.IDatabaseTester;
import org.dbunit.IOperationListener;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;

public class EmapSessionBasedDatabaseTester implements IDatabaseTester {

	@Override
	public void closeConnection(IDatabaseConnection arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public IDatabaseConnection getConnection() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDataSet getDataSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseOperation getSetUpOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseOperation getTearDownOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onSetup() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTearDown() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDataSet(IDataSet arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOperationListener(IOperationListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSchema(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSetUpOperation(DatabaseOperation arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTearDownOperation(DatabaseOperation arg0) {
		// TODO Auto-generated method stub

	}

}
