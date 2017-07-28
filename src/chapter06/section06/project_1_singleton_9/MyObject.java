package chapter06.section06.project_1_singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum MyObject {
	connectionFactory;

	private Connection connection;

	private MyObject() {
		try {
			System.out.println("调用了MyObject的构造");
			String url = "jdbc:sqlserver://localhost:1079;databaseName=ghydb";
			String username = "sa";
			String password = "";
			String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
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
