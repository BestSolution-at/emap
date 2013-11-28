import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.imageio.stream.FileImageInputStream;


public class MyTest {

	public static void main(String[] args) {
		StringBuilder b = new StringBuilder();
		byte[] buf = new byte[1024];
		int l;
		InputStream in = MyTest.class.getResourceAsStream("my.sql");
		try {
			while( (l = in.read(buf)) != -1 ) {
				b.append(new String(buf,0,l));

			}

			Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
			Connection connection = DriverManager.getConnection("jdbc:firebirdsql://127.0.0.1:3050/C:\\bizerba\\targets\\targets\\dbs\\RETAILFRAMEWORK_BASELINE.FDB?charSet=UTF-8", "RETAILADMIN", "170306");
			Statement stmt = connection.createStatement();
			ResultSet set = stmt.executeQuery(b.toString());
			long t = System.currentTimeMillis();
			long count = 0;
			while( set.next() ) {
				count++;
			}
			System.err.println("Count: " + count);
			System.err.println((System.currentTimeMillis() - t )/1000.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
