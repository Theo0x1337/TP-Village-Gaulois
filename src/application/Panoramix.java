package application;

import infos.Registre;
import localisation.Adresse;
import potion.Potion;
import potion.RegistrePotions;

public class Panoramix extends Habitant {

	public Panoramix(String nnig, String nom, String spe, Adresse ad, String statut) {
		super(nnig, nom, spe, ad, statut);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void consulterRegistre(Registre r) {
		for(Habitant hab : r.getRegistre()) {
			System.out.println(r);
		}
	}
	
	
	public void trouverHabRegistreParNNIG(Registre r, String nnig) {
		for(Habitant hab : r.getRegistre()) {
			if (hab.getNNIG().equals(nnig)) {
				System.out.println(hab);
			}
		}
	}
	
	
	public void faisPrendreUnePotion(Habitant hab, Potion p, RegistrePotions rp) {
		//todo
	}
	

}
