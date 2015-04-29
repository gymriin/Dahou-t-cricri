package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cricri.Dahouët.metiers.Voilier;
import com.cricri.Dahouët.ui.recordShipUI;

public class SerieDAO {
	private static Connection c;

	public static void Serie() {
		c = connectDAO.cConnect();

		Statement etat;
		try {
			etat = c.createStatement();

			String sql = "select Nom_serie from Serie";
			ResultSet result = etat.executeQuery(sql);

			while (result.next()) {
				String Serie = result.getString("Nom_serie");
				recordShipUI.cmbSerie.addItem(Serie);

			}
			
			etat.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
