package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.cricri.Dahouët.ui.recordShipUI;

public class ProprioDAO {
	private static Connection c;
	public static void nomPro() {
		c = connectDAO.cConnect();
		Statement etat;
		String sql = "select Nom_proprietaire from proprietaire ";

		try {
			ResultSet result = null;
			etat = c.createStatement();
			result = etat.executeQuery(sql);

			while (result.next()) {
				String nom = result.getString("Nom_proprietaire");
				recordShipUI.nomProprio.addItem(nom);
			}
			etat.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "erreur");
		}
	}
}
