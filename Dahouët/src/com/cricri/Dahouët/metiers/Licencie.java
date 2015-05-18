package com.cricri.Dahouët.metiers;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.cricri.Dahouët.utils.Calculs;

public class Licencie extends Personne {

	// Déclaration des variables
	private int numeroLicence;
	private double pointsFFV;
	private Date dateNaissance;
	private int anneeLicence;

	// Mise en place des constructeurs

	public int getNumeroLicence() {
		return numeroLicence;
	}

	public Licencie(String nom, String mail, String prenom, int numeroLicence,
			double pointsFFV, Date dateNaissance, int anneeLicence) {
		super(nom, mail, prenom);
		this.numeroLicence = numeroLicence;
		this.pointsFFV = pointsFFV;
		this.dateNaissance = dateNaissance;
		this.anneeLicence = anneeLicence;

	}

	// Mise en place des getters/setters
	public void setNumeroLicence(int numeroLicence) {
		this.numeroLicence = numeroLicence;
	}

	public double getPointsFFV() {
		return pointsFFV;
	}

	public void setPointsFFV(double pointsFFV) {
		this.pointsFFV = pointsFFV;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAnneeLicence() {
		return anneeLicence;
	}

	public void setAnneeLicence(int anneeLicence) {
		this.anneeLicence = anneeLicence;
	}

	@Override
	public String toString() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		return "Licencie :\n" + "numeroLicence=" + numeroLicence
				+ "\npointsFFV=" + pointsFFV + "\ndateNaissance(aaaa/MM/dd)="
				+ dateFormat.format(dateNaissance) + "\nanneeLicence="
				+ anneeLicence + "\nnom=" + nom + "\nmail=" + mail
				+ "\nprenom=" + prenom + "\nage="
				+ Calculs.calculAge(dateNaissance);
	}

	// mise en place String to String pour retour affichage

}
