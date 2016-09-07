package test.junit;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import at.bestsolution.persistence.java.JDBCConfiguration;

@Component(immediate=true)
public class EnvironmentConfigProvider {

	public static class EnvironmentConfig implements JDBCConfiguration {
		private final String id;
		private final String username;
		private final String password;
		private final String url;
		private final String driverClassName;
		private final String databaseName;
		
		public EnvironmentConfig(String id, String username, String password, String url, String driverClassName, String databaseName) {
			this.id = id;
			this.username = username;
			this.password = password;
			this.url = url;
			this.driverClassName = driverClassName;
			this.databaseName = databaseName;
		}
		
		@Override
		public String getId() {
			return id;
		}

		@Override
		public String getUsername() {
			return username;
		}

		@Override
		public String getPassword() {
			return password;
		}

		@Override
		public String getConnectionURL() {
			return url;
		}

		@Override
		public Class<?> getJDBCDriver() {
			try {
				return Class.forName(driverClassName);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

		@Override
		public String getDatabaseType() {
			return databaseName;
		}
		
		@Override
		public String toString() {
			return "EnvironmentConfig("
					+ "\n\tid = " + id
					+ "\n\tusername = " + username
					+ "\n\tpassword = " + (password != null ? password.replaceAll(".", "*") : null)
					+ "\n\turl = " + url
					+ "\n\tdriver = " + driverClassName
					+ "\n\tname = " + databaseName
					+ "\n)";
		}
	}
	
	@Activate
	protected void activate(BundleContext context) {
			System.out.println("Activating EnvironmentConfigProvider");
			String dbs = System.getenv("EMAP_DBS");
			System.out.println(" -> dbs = " + dbs);
			if (dbs != null && !dbs.isEmpty()) {
				String[] dbList = dbs.split(",");
				for (String db : dbList) {
					try {
						String id = db.trim();
						String username = System.getenv("EMAP_DB_" + id + "_USERNAME");
						String password = System.getenv("EMAP_DB_" + id + "_PASSWORD");
						String url = System.getenv("EMAP_DB_" + id + "_URL");
						String driver = System.getenv("EMAP_DB_" + id + "_DRIVER");
						String databaseName = System.getenv("EMAP_DB_" + id + "_NAME");
						
						JDBCConfiguration config = new EnvironmentConfig(id, username, password, url, driver, databaseName);
						
						System.out.println(" -> providing environment based config: " + config);
						ServiceRegistration<JDBCConfiguration> registration = context.registerService(JDBCConfiguration.class, config, null);
						System.out.println(" -> registration = " + registration);
					}
					catch (Throwable e) {
						System.out.println("COULD NOT PROVIDE ENV CONFIG FOR " + db);
						e.printStackTrace(System.out);
					}
				}
			}
	}

}
