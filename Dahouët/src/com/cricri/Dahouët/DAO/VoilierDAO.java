package com.cricri.Dahouët.DAO;

import java.sql.Connection;
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
			
			String sql = "select Nom_proprietaire. from proprietaire";
	        ResultSet result = etat.executeQuery(sql);
	      
	        
	        while (result.next()){
	        	Voilier v1 = new Voilier(((ResultSet) etat).getString("nom"));
	        	
	        	voil.add(v1);
	        }
	        etat.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return voil;
		
	}
}
