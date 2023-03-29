package com.learn.java.interview;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager implements Serializable {
	private static final long serialVersionUID = 1L;

	private ConnectionManager() {
	}

	private static class ConnectionInstanceHolder {
		private static final ConnectionManager INSTANCE = new ConnectionManager();
	}

	public static ConnectionManager getInstance() {
		return ConnectionInstanceHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Properties pros = new Properties();
			pros.load(new FileReader("src/application.properties"));
			conn = DriverManager.getConnection(pros.getProperty("db.url"), pros.getProperty("db.username"),
					pros.getProperty("db.password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public void closePreparedStatement(PreparedStatement prep) {
		if (prep != null) {
			try {
				prep.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void closeResultSet(ResultSet result) {
		if (result != null) {
			try {
				result.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
