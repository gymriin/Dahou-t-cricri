package com.cricri.Dahou�t.Controller;

import java.util.List;

import com.cricri.Dahou�t.DAO.ClasseDAO;
import com.cricri.Dahou�t.DAO.ClubDAO;
import com.cricri.Dahou�t.DAO.ProprioDAO;
import com.cricri.Dahou�t.DAO.SerieDAO;
import com.cricri.Dahou�t.DAO.VoilierDAO;
import com.cricri.Dahou�t.metiers.Club;
import com.cricri.Dahou�t.metiers.Voilier;
import com.cricri.Dahou�t.metiers.newProprio;
import com.cricri.Dahou�t.ui.OwnerUI;
import com.cricri.Dahou�t.ui.recordShipUI;

public class controls {
	public static void fillListSerie() {

		try {
			List<String> listeseries = SerieDAO.getListSerie();
			for (String nomSerie : listeseries)
				recordShipUI.cmbSerie.addItem(nomSerie);
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static void fillClasse(String nomSerie) {
		try {
			List<String> classes = ClasseDAO.getClasse(nomSerie);
			for (String nomClasse : classes)
				recordShipUI.cmbClasse.addItem(nomClasse);
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static void fillProp() {

		try {
			List<String> listeproprios = ProprioDAO.getProprio();
			for (String nomproprio : listeproprios)
				recordShipUI.nomProprio.addItem(nomproprio);
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static void remplirListClub() {

		try {
			List<String> listeclub = ClubDAO.getListClub();
			for (String nomclub : listeclub)
				OwnerUI.champClub.addItem(nomclub);

		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public static void saveProprio() throws Exception {

		String nomClub = OwnerUI.champClub.getSelectedItem().toString();
		Club club = new Club(0, null);
		club = ClubDAO.getClub(nomClub);
		int numClub = club.getNumClub();
		newProprio proprioNew = new newProprio(club,
				OwnerUI.champNom.getText(), OwnerUI.champAdress.getText());
		ProprioDAO.createProprio(proprioNew, numClub);
	}

	public static void saveVoilier() throws Exception {

		String nomProprio = recordShipUI.nomProprio.getSelectedItem()
				.toString();
		int numProprio = ProprioDAO.getNumProprio(nomProprio);
		String nomClasse = recordShipUI.cmbClasse.getSelectedItem().toString();
		String nomVoilier = recordShipUI.nomVoil.getText();

		Voilier v = new Voilier(numProprio, nomClasse, nomVoilier);
		VoilierDAO.createVoilier(v);
	}
}
