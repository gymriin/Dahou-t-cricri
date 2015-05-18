package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cricri.Dahouët.metiers.Voilier;

public class VoilierDAO {
	private static Connection c;

	public static List<Voilier> getVoilier() {
		c = connectDAO.cConnect();

		List<Voilier> voil = new ArrayList<>();
		// test avec select
		Statement etat;
		try {
			etat = c.createStatement();

			String sql = "select Nom_classe from classe";
			ResultSet result = etat.executeQuery(sql);

			result.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return voil;

	}

	public static void createVoilier(Voilier v) throws Exception {
		c = connectDAO.cConnect();
		PreparedStatement stm;
		try {
			stm = c.prepareStatement("INSERT INTO voilier (Num_proprietaire, Nom_classe, nom_voilier) VALUES (?,?,?)");

			stm.setInt(1, v.getNumProprietaire());
			stm.setString(2, v.getNomClasse());
			stm.setString(3, v.getNomVoilier());
			stm.execute();

			stm.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
