package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.cricri.Dahouët.metiers.newProprio;
import com.cricri.Dahouët.ui.recordShipUI;

public class ProprioDAO {
	private static Connection c;

	public static List<String> getProprio() {
		c = connectDAO.cConnect();

		List<String> prop = new ArrayList<>();
		Statement etat;

		try {
			String nom;
			String sql = "select Nom_proprietaire from proprietaire ";

			ResultSet result = null;
			etat = c.createStatement();
			result = etat.executeQuery(sql);

			while (result.next()) {
				nom = result.getString("Nom_proprietaire");
				recordShipUI.nomProprio.addItem(nom);
			}
			etat.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "erreur");
		}
		return prop;
	}

	public static void createProprio(newProprio p, int numClub)
			throws Exception {

		c = connectDAO.cConnect();
		PreparedStatement etat;
		try {
			etat = c.prepareStatement("INSERT INTO proprietaire (Num_club, Nom_proprietaire, Coordonnees_proprietaire) VALUES (?,?,?)");

			etat.setInt(1, numClub);
			etat.setString(2, p.getNomPro());
			etat.setString(3, p.getCoorPro());
			etat.execute();

			etat.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static int getNumProprio(String nomProprio) {

		int numProprio = 0;

		Connection c = connectDAO.cConnect();
		Statement etat;
		try {
			etat = c.createStatement();
			String sql = "select Num_proprietaire from proprietaire  WHERE Nom_proprietaire="
					+ "'" + nomProprio + "'" + ";";
			ResultSet result = etat.executeQuery(sql);

			result.next();
			numProprio = result.getInt("Num_proprietaire");
			result.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return numProprio;
	}
}
