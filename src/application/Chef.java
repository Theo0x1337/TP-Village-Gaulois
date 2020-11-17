package application;

import batailles.Combat;
import infos.Registre;
import localisation.Adresse;
import localisation.Quartier;

public class Chef extends Habitant {

	private Registre registre;
	
	public Chef(String nnig, String nom, String spe, Adresse ad, String statut) {
		super(nnig, nom, spe, ad,statut);
		// TODO Auto-generated constructor stub
	}
	
	
	public void prevenir(Quartier q) {
		for (Habitant hab : this.registre.getRegistre()) {
			if (hab.getAdresse().getQuartier().getNom().equals(q.getNom()) && (hab instanceof Combattant) ) {
				System.out.println("Je suis le chef et je te préviens toi, "+hab.getNom()+" référencé dans notre "
						+ "village sous le numéro "+ hab.getNNIG()+ " que tu dois participer au combat ");
			}
		}
	}
	
	
	public void prevenirCombattant(Combat c) {
		for (Combattant comb : c.getListeCbt()) {
			System.out.println("Moi le chef du village te prévient, "+comb.getNom()+" référencé sous le numéro "+comb.getNNIG()+ " du plan de bataille qui est le suivant : "+ c.getPlanDeBataille());
		}
	}
	
	
	public void planifierPlanBataille(Combat c, String plan) {
		c.setPlanDeBataille(plan);
	}

}
