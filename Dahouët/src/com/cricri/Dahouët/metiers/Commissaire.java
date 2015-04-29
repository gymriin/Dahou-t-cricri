package com.cricri.Dahouët.metiers;

public class Commissaire extends Personne {

	// Déclaration variable locale
	private String comite;

	// Mise en place des constructeurs

	public Commissaire(String nom, String mail, String prenom, String comite) {
		super(nom, mail, prenom);
		this.comite = comite;
	}

	// Mise en place getters/setters
	public String getComite() {
		return comite;
	}

	public void setComite(String comite) {
		this.comite = comite;
	}

	// mise en place String to String pour retour affichage
	public String toString() {
		return "\n\nCommissaire:\ncomite=" + comite +"\nnom=" + nom + "\nmail="
				+ mail + "\nprenom=" + prenom ;
	}

	
	

}
