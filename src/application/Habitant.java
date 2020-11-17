package application;

import java.util.ArrayList;
import java.util.Date;

import localisation.Adresse;
import musee.Casque;
import potion.Potion;

public class Habitant {
	
	private String NNIG;
	private String nom;
	private String specialite;
	private Adresse adresse;
	private String statut;
	private Date dateNaiss;
	private int poids;
	private ArrayList<Casque> casqueRapporte = new ArrayList<Casque>();
	
	
	
	public Habitant(String nnig, String nom, String spe, Adresse ad,String statut) {
		this.NNIG = nnig;
		this.nom = nom;
		this.specialite = spe;
		this.adresse = ad;
		this.statut = statut;
	}
	

	public boolean prendreUnCasque(Casque c) {
		if(!casqueRapporte.contains(c)) {
			this.casqueRapporte.add(c);
			return true;
		}
		return false;
	}
	

	public String getNNIG() {
		return NNIG;
	}



	public String getNom() {
		return nom;
	}



	public String getSpecialite() {
		return specialite;
	}



	public Adresse getAdresse() {
		return adresse;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public ArrayList<Casque> getCasqueRapporte() {
		return casqueRapporte;
	}


	public void setCasqueRapporte(ArrayList<Casque> casqueRapporte) {
		this.casqueRapporte = casqueRapporte;
	}


	public void setNNIG(String nNIG) {
		NNIG = nNIG;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public void clearCasqueRapporte() {
		// TODO Auto-generated method stub
		this.casqueRapporte.clear();
	}
	
	
	
	

}
