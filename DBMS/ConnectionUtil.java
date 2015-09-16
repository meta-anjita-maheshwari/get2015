package com.metacube.jdbc.example;
/**
 * JDBC Assignment1,2,3
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Anjita
 * class to get driver connection
 */
public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/lis";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection con = null;

	public Connection getConnection() {
		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
