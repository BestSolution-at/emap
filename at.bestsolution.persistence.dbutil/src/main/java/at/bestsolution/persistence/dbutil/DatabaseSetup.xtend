package at.bestsolution.persistence.dbutil

import java.sql.Connection
import java.sql.DriverManager
import com.google.common.io.Files
import java.io.File
import com.google.common.base.Charsets
import java.util.ArrayList
import java.sql.CallableStatement

class DatabaseSetup {
	val Configuration configuration;
	val Database db;
	val Connection connection;
	
	var boolean comment;
	var boolean procedure;
	
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
		
		println("Setup data")
		configuration.initscripts.filter[it.dbtype == db.name].forEach[handleInitScript]
	}
	
	def handleInitScript(Initscripts ss) {
		ss.datascripts.forEach([s|
			println(" Running script " + s)
			new File(s).handleScript
		])
		
		
	}

	def handleDropProject(Mappingprojects p) {
		println(" Working for " + p.name )
		new File(configuration.basedir + "/" + p.name + "/src-gen/ddls/drop_" + db.name + ".sql" ).handleScript;
	}
	
	def handleSetupProject(Mappingprojects p) {
		println("  Working for " + p.name )
		new File(configuration.basedir + "/" + p.name + "/src-gen/ddls/create_" + db.name + ".sql" ).handleScript;
	}
	
	def handleScript(File scriptFile) {
		val queries = new ArrayList<StringBuilder>()
		queries.add(new StringBuilder(""))
		comment = false;
		
		procedure = false;
		
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
		if( q.toString.toLowerCase.startsWith("execute") ) {
			val query = q.toString.substring(0,q.toString.length-1);
			val execCall = "{ call " + query.substring("execute".length, query.length) + "}"
			var CallableStatement stmt;
			try {
				stmt = connection.prepareCall(execCall);
				stmt.executeQuery
			} catch(Exception e) {
				println("FAILED: " + execCall)
				e.printStackTrace
//				System.exit(0)
			} finally {
				stmt?.close	
			}			
			
		} else {
			val stmt = connection.createStatement;
			val query = q.toString.substring(0,q.toString.length-1);
			try {
//				println(query)
				stmt.execute(query);	
			} catch(Exception e) {
				println("FAILED: " + q)
				e.printStackTrace
//				System.exit(0)
			} finally {
				stmt.close	
			}			
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