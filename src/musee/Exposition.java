package musee;

import java.util.ArrayList;

public class Exposition {
	
	
	private String nom;
	private ArrayList<Casque> casqueExposes = new ArrayList<Casque>();
	

	public Exposition(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}
	
	
	public void ajouterCasque(Casque c) {
		this.casqueExposes.add(c);
	}
	

}
