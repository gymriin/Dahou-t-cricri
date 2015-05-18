package com.cricri.Dahouët.metiers;

public class newProprio {
	int numPro;
	Club club;
	String nomPro;
	String coorPro;

	public newProprio(Club club, String nomPro, String coorPro) {
		super();
		this.club = club;
		this.nomPro = nomPro;
		this.coorPro = coorPro;
	}

	public int getNumPro() {
		return numPro;
	}

	public void setNumPro(int numPro) {
		this.numPro = numPro;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public String getNomPro() {
		return nomPro;
	}

	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}

	public String getCoorPro() {
		return coorPro;
	}

	public void setCoorPro(String coorPro) {
		this.coorPro = coorPro;
	}
}
