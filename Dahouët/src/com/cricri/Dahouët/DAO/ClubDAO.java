package com.cricri.Dahouët.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cricri.Dahouët.metiers.Club;

public class ClubDAO {
	private static Connection c;

	public static List<String> getListClub() {
		c = connectDAO.cConnect();

		List<String> club = new ArrayList<>();
		Statement stm;
		String nomclub;
		try {
			stm = c.createStatement();
			String sql = "select nom_club from club ";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				nomclub = rs.getString("nom_club");
				club.add(nomclub);

			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return club;

	}

	public static Club getClub(String nomClub) {
		Club newCl = null;
		int numClub = 0;

		c = connectDAO.cConnect();
		Statement stm;
		try {
			stm = c.createStatement();
			String sql = "select Num_club from club  WHERE nom_club=" + "'"
					+ nomClub + "'" + ";";
			ResultSet rs = stm.executeQuery(sql);

			rs.next();
			numClub = rs.getInt("Num_club");
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		newCl = new Club(numClub, nomClub);
		return newCl;
	}
}
