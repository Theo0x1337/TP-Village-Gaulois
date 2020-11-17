package musee;

import java.util.ArrayList;

public class Musee {

	private String nom;
	private ArrayList<Casque> listeCasque = new ArrayList<Casque>();
	
	
	public Musee(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}
	
	public boolean ajouterCasque(Casque c) {
		if(!this.listeCasque.contains(c)) {
			this.listeCasque.add(c);
			return true;
		}
		return false;
	}

}
