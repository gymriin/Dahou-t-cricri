package com.cricri.Dahou�t.metiers;

public class Proprietaire extends Personne {

	// D�claration des variables
	private String telephone;
	private String adresse;

	

	public Proprietaire(String nom, String mail, String prenom,
			String telephone, String adresse) {
		super(nom, mail, prenom);
		this.telephone = telephone;
		this.adresse = adresse;
	}

	// Mise en place des getters/setters
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	// mise en place String to String pour retour affichage
	public String toString() {
		return "\n\nProprietaire :\ntelephone=" + telephone + "\nadresse=" + adresse
				+ "\nnom=" + nom + "\nmail=" + mail + "\nprenom=" + prenom;
	}

	
	
}
