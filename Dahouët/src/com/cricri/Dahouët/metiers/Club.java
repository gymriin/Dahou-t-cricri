package com.cricri.Dahouët.metiers;

public class Club {
	public Club(int numClub) {
		super();
		this.numClub = numClub;
	}

	public Club(String nomClub) {
		super();
		this.nomClub = nomClub;
	}

	int numClub;
	String nomClub;

	public Club(int numClub, String nomClub) {
		super();
		this.numClub = numClub;
		this.nomClub = nomClub;
	}

	public int getNumClub() {
		return numClub;
	}

	public void setNumClub(int numClub) {
		this.numClub = numClub;
	}

	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
}
