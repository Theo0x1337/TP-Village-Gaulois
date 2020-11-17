package potion;

import java.util.ArrayList;

public class RegistrePotions {
	
	
	private ArrayList<PrisePotions> registrePrisePotions = new ArrayList<PrisePotions>();

	public RegistrePotions() {
		// TODO Auto-generated constructor stub
	}

	
	
	public void ajouterPrisePotions(PrisePotions p) {
		this.registrePrisePotions.add(p);
	}
	
}
