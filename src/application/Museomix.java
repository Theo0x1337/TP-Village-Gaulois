package application;

import localisation.Adresse;
import musee.Prise;
import musee.RegistreCasque;

public class Museomix extends Habitant {

	public Museomix(String nnig, String nom, String spe, Adresse ad, String statut) {
		super(nnig, nom, spe, ad, statut);
		// TODO Auto-generated constructor stub
	}
	
	
	public void enregistrerCasque(RegistreCasque rc, Habitant hab) {
		rc.ajouterPrise(new Prise(hab.getNNIG(),hab.getCasqueRapporte().get(0).getCombat().getDateFin(),hab.getCasqueRapporte().get(0).getCombat().getLieu(),hab.getCasqueRapporte()));
		hab.clearCasqueRapporte();
	}
	
	

}
