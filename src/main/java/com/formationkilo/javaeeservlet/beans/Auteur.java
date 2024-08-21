package com.formationkilo.javaeeservlet.beans;

public class Auteur {
	private String nom,prenom;
	private boolean actif;
	
	public Auteur() {
	}
	
	public Auteur(String nom, String prenom, boolean actif) {
		this.nom = nom;
		this.prenom = prenom;
		this.actif = actif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}
	


}
