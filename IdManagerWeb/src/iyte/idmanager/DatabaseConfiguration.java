package iyte.idmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {

	private static final String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	
	private final String url = Messages.getString("DatabaseConfiguration.jdbc_db2_url");
	private final String username = Messages.getString("DatabaseConfiguration.db_uname");
	private final String password = Messages.getString("DatabaseConfiguration.db_pass");
		
	private static DatabaseConfiguration instance = null;
	
	private DatabaseConfiguration() {
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DatabaseConfiguration.DRIVER_NAME); //$NON-NLS-1$
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized DatabaseConfiguration getInstance() {
		if(instance == null) {
			instance = new DatabaseConfiguration(); 		
		}
		return instance;
	}
}
