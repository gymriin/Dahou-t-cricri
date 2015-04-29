package com.cricri.Dahouët.metiers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Voilier implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int noVoile;
	private String nomVoilier;
	private String nomClasse;
	private String nomSerie;
	private int coeff;
	private int noProp;
	private String adress;
	private String nomProp;
	
	private List<Voilier> voiliers = new ArrayList<Voilier>();
	public Voilier(String nomVoilier) {
		super();
		this.nomVoilier = nomVoilier;
	}
	public void addVoilier(Voilier v){
		voiliers.add(v);
	}
	public int getNoVoile() {
		return noVoile;
	}
	public void setNoVoile(int noVoile) {
		this.noVoile = noVoile;
	}
	public String getNomVoilier() {
		return nomVoilier;
	}
	public void setNomVoilier(String nomVoilier) {
		this.nomVoilier = nomVoilier;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public String getNomSerie() {
		return nomSerie;
	}
	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}
	public int getCoeff() {
		return coeff;
	}
	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}
	public int getNoProp() {
		return noProp;
	}
	public void setNoProp(int noProp) {
		this.noProp = noProp;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNomProp() {
		return nomProp;
	}
	public void setNomProp(String nomProp) {
		this.nomProp = nomProp;
	}
	public List<Voilier> getVoiliers() {
		return voiliers;
	}
	
	
}
