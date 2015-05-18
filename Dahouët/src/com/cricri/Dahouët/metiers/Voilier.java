package com.cricri.Dahouët.metiers;

public class Voilier {

	int NumVoile;
	int NumProprietaire;
	String NomClasse;
	String NomVoilier;

	public Voilier(int numProprietaire, String nomClasse, String nomVoilier) {
		super();
		NumProprietaire = numProprietaire;
		NomClasse = nomClasse;
		NomVoilier = nomVoilier;
	}

	public int getNumProprietaire() {
		return NumProprietaire;
	}

	public void setNumProprietaire(int numProprietaire) {
		NumProprietaire = numProprietaire;
	}

	public String getNomClasse() {
		return NomClasse;
	}

	public void setNomClasse(String nomClasse) {
		NomClasse = nomClasse;
	}

	public String getNomVoilier() {
		return NomVoilier;
	}

	public void setNomVoilier(String nomVoilier) {
		NomVoilier = nomVoilier;
	}

}
