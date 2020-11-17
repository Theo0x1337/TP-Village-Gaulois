package musee;

import batailles.Combat;

public class Casque {
	
	private Combat combat;
	private String type;
	private String etat;
	private String grade;
	private boolean enService;

	public Casque(Combat comb, String type, String etat, String grade) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.etat = etat;
		this.grade = grade;
		this.enService = true;
		this.combat = comb;
	}
	
	
	
	public void setService(boolean val) {
		this.enService = val;
	}



	public Combat getCombat() {
		return combat;
	}



	public void setCombat(Combat combat) {
		this.combat = combat;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public boolean isEnService() {
		return enService;
	}



	public void setEnService(boolean enService) {
		this.enService = enService;
	}
	

}
