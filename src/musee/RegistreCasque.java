package musee;

import java.util.ArrayList;

public class RegistreCasque {
	
	private ArrayList<Prise> registreEnregistrementCasque = new ArrayList<Prise>();

	public RegistreCasque() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean ajouterPrise(Prise p) {
		if (!this.registreEnregistrementCasque.contains(p)) {
			this.registreEnregistrementCasque.add(p);
			return true;
		}
		return false;
	}
	
	
	
	

}
