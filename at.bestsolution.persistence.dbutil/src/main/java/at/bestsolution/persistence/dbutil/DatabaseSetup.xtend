package at.bestsolution.persistence.dbutil

class DatabaseSetup {
	def static void main(String[] args) {
		val c = new Configuration(System.getProperty("persistence.config"));
		c.databases.forEach[handleDb(c)]
	}
	
	def static handleDb(Database db, Configuration config) {
		
	}
}