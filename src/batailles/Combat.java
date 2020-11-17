package batailles;

import java.util.ArrayList;
import java.util.Date;

import application.Combattant;

public class Combat {
	
	private String nom;
	private String planDeBataille;
	private Date dateDebut;
	private Date dateFin;
	private String lieu;
	private ArrayList<Combattant> listeCbt = new ArrayList<Combattant>();

	public Combat(String nom, Date date, String lieu) {
		this.nom = nom;
		this.dateDebut = date;
		this.lieu = lieu;
	}
	
	
	public boolean ajouterCombattant(Combattant c) {
		if (!listeCbt.contains(c)) {
			this.listeCbt.add(c);
			return true;
		}
		
		return false;
	}
	
	
	public void setFinCombat(Date fin) {
		this.dateFin = fin;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPlanDeBataille() {
		return planDeBataille;
	}

	public void setPlanDeBataille(String planDeBataille) {
		this.planDeBataille = planDeBataille;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDate(Date date) {
		this.dateDebut = date;
	}

	public ArrayList<Combattant> getListeCbt() {
		return listeCbt;
	}

	public void setListeCbt(ArrayList<Combattant> listeCbt) {
		this.listeCbt = listeCbt;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public String getLieu() {
		return lieu;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	
	

}
