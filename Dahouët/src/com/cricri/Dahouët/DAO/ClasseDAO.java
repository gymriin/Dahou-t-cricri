package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ClasseDAO {
	private static Connection c;

	public static List<String> getClasse(String nomSerie) {
		c = connectDAO.cConnect();
		List<String> classe1 = new ArrayList<>();
		String nomclasse;
		try {
			Statement etat;
			etat = c.createStatement();
			String sql = "select classe.Nom_classe from classe "
					+ "inner join serie on classe.Num_serie = serie.Num_serie "
					+ " where serie.Nom_serie = " + "'" + nomSerie + "'" + ";";

			ResultSet result = null;

			result = etat.executeQuery(sql);

			while (result.next()) {
				nomclasse = result.getString("Nom_classe");
				classe1.add(nomclasse);
			}
			etat.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "erreur");
		}
		return classe1;
	}

}
