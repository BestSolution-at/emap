package at.bestsolution.persistence.dbutil

import java.sql.Connection
import java.sql.DriverManager
import com.google.common.io.Files
import java.io.File
import com.google.common.base.Charsets
import java.util.ArrayList

class DatabaseSetup {
	val Configuration configuration;
	val Database db;
	val Connection connection;
	
	var boolean comment;
	
	new(Configuration configuration, Database db) {
		this.configuration = configuration
		this.db = db
		this.connection = setupConnection()
	}
	
	def setupConnection() {
		Class.forName(db.jdbcdriver)
		return DriverManager.getConnection(db.jdbcurl, db.username, db.password)
	}
	
	def setup() {
		println("Starting setup for " + db.name)
		
		println("Dropping content")
		configuration.mappingprojects.reverse.forEach[handleDropProject]
		
		println("Setting up structure")
		configuration.mappingprojects.forEach[handleSetupProject]
	}

	def handleDropProject(Mappingprojects p) {
		new File(configuration.basedir + "/" + p.name + "/src-gen/ddls/drop_" + db.name + ".sql" ).handleScript;
	}
	
	def handleSetupProject(Mappingprojects p) {
		println("Setting up project " + p )
		new File(configuration.basedir + "/" + p.name + "/src-gen/ddls/create_" + db.name + ".sql" ).handleScript;
	}
	
	def handleScript(File scriptFile) {
		val queries = new ArrayList<StringBuilder>()
		queries.add(new StringBuilder(""))
		comment = false;
		
		Files.readLines(scriptFile,Charsets.UTF_8).filter[filterComments].forEach([ line|
				queries.last.append(line)
				if( line.trim.endsWith(";") ) {
					queries.add(new StringBuilder)
				}
			]
		);
		queries.filter[!it.toString.trim.empty].forEach[executeQuery]
	}
	
	def executeQuery(StringBuilder q) {
		val stmt = connection.createStatement;
		val query = q.toString.substring(0,q.toString.length-1);
		try {
			stmt.execute(query);	
		} catch(Exception e) {
			e.printStackTrace;
		} finally {
			stmt.close	
		}
	}
	
	def filterComments(String line) {
		if( comment ) {
			if( line.endsWith("*/") ) {
				comment = false;
			}
			return false;
		}
		
		if( line.startsWith("/*") ) {
			if( ! line.endsWith("*/") ) {
				comment = true;	
			}
			
			return false;
		}
		
		return ! line.startsWith("--");
	}
	
	def static void main(String[] args) {
		val c = new Configuration(System.getProperty("persistence.config"));
		c.databases.forEach[db|
			new DatabaseSetup(c,db).setup
		]
	}
	
}