package infos;
import java.util.ArrayList;

import application.Habitant;


public class Registre {
	
	private ArrayList<Habitant> registre = new ArrayList<Habitant>();
	
	
	public boolean ajouterHabitant(Habitant hab) {
		if (!this.registre.contains(hab)) {
			this.registre.add(hab);
			return true;
		}
		
		return false;
	}


	public ArrayList<Habitant> getRegistre() {
		return registre;
	}


	public void setRegistre(ArrayList<Habitant> registre) {
		this.registre = registre;
	}
	
	
}



