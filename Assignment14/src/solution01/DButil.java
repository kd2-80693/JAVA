package solution01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/forJava";
	private static final String DB_USER = "kd2_80693_kritagya";
	private static final String DB_PASSWORD = "wwnbtr";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()throws SQLException
	{
		Connection conn=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return conn;
	}
}
