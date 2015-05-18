package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SerieDAO {
	private static Connection c;

	public static List<String> getListSerie() {
		c = connectDAO.cConnect();
		List<String> Ser = new ArrayList<>();

		try {
			Statement etat;
			String nomSerie;
			etat = c.createStatement();

			String sql = "select Nom_serie from Serie";
			ResultSet result = etat.executeQuery(sql);

			while (result.next()) {
				nomSerie = result.getString("Nom_serie");
				Ser.add(nomSerie);

			}

			etat.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Ser;
	}
}
