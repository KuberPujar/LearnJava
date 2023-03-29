package com.learn.java.interview;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class FetchCountriesFromDb {
	static ConnectionManager connectionManegr = ConnectionManager.getInstance();
	static PreparedStatement preparedStmt = null;
	static ResultSet resultSet = null;
	static Connection conn = null;

	public static void main(String[] args) {
		try {
			Properties pros = new Properties();
			pros.load(new FileReader("src/application.properties"));
			conn = connectionManegr.getConnection();
			preparedStmt = conn.prepareStatement(pros.getProperty("db.sql"));
			resultSet = preparedStmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Coutry::" + resultSet.getString("country_name") + " region_id:"
						+ resultSet.getString("region_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectionManegr.closeResultSet(resultSet);
			connectionManegr.closePreparedStatement(preparedStmt);
			connectionManegr.closeConnection(conn);
		}
	}

}
