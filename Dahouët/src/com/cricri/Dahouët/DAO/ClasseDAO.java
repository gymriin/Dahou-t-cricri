package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.cricri.Dahouët.ui.recordShipUI;

public class ClasseDAO {
	private static Connection c;
	public static void Classe(int codeSerie) {
		c = connectDAO.cConnect();
		Statement etat;
		String sql = "select Nom_classe from classe where Num_serie ="
				+ codeSerie;

		try {
			ResultSet result = null;
			etat = c.createStatement();
			result = etat.executeQuery(sql);

			while (result.next()) {
				String nomClasse = result.getString("Nom_classe");
				recordShipUI.cmbClasse.addItem(nomClasse);
			}
			etat.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "erreur");
		}
	}

}
