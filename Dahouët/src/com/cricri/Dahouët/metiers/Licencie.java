package com.cricri.Dahou�t.metiers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class Licencie extends Personne {

	// D�claration des variables
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

	// mise en place String to String pour retour affichage
	public String toString() {
		return "Licencie [numeroLicence=" + numeroLicence + ", pointsFFV="
				+ pointsFFV + ", dateNaissance=" + dateNaissance
				+ ", anneeLicence=" + anneeLicence + "]";
	}

}
