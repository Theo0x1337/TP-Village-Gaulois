package musee;

import java.util.ArrayList;
import java.util.Date;

public class Prise {
	
	private String initiateurPrise; // le NNIG de la personne qui ramene les casques
	private Date datePrise;
	private String lieu;
	private ArrayList<Casque> listeCasque = new ArrayList<Casque>(); // on recupere le nbr de casque prit en faisant la taille de la liste
	
	
	public Prise(String nnig, Date date, String lieu, ArrayList<Casque> casquePrit) {
		this.initiateurPrise = nnig;
		this.datePrise = date;
		this.lieu = lieu;
		this.listeCasque = casquePrit;
	}

}
