package thread_6.thread_6_7.project_1_singleton_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {
	
	public enum MyEnumSingleton {
		connectionFactory;

		private Connection connection;

		private MyEnumSingleton() {
			try {
				System.out.println("创建MyObject对象");
				String url = "jdbc:sqlserver://localhost:1079;databaseName=y2";
				String username = "sa";
				String password = "";
				String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, username,
						password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public Connection getConnection() {
			return connection;
		}
	}

	public static Connection getConnection() {
		return MyEnumSingleton.connectionFactory.getConnection();
	}

}
