package application;

import batailles.Combat;
import localisation.Adresse;

public class Combattant extends Habitant {

	public Combattant(String nnig, String nom, String spe, Adresse ad, String statut) {
		super(nnig, nom, spe, ad,statut);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean inscriptionCombat(Combat c) {
		System.out.println("Moi, "+this.getNom()+" référencé sous le numéro "+this.getNNIG()+" m'inscrit au combat "+c.getNom());
		return c.ajouterCombattant(this);
	}
	
	
}
