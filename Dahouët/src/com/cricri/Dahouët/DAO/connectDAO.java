package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDAO {
	static Connection con = null;

	public static Connection cConnect() {
		String url = "jdbc:mysql://localhost/dahouëtfinal2";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// On se connecte via la passerelle jdbc Oracle

			return con = DriverManager.getConnection(url, "root", "");
		} catch (SQLException sqlE) {
			System.out.println("Sql Erreur " + sqlE.getMessage());
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
