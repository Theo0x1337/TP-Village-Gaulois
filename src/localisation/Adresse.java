package localisation;

public class Adresse {
	
	private Quartier quartier;
	private String voie;
	private int numero;
	
	
	public Adresse(Quartier q, String voie, int num) {
		this.quartier = q;
		this.voie = voie;
		this.numero = num;
	}


	public Quartier getQuartier() {
		return quartier;
	}


	public String getVoie() {
		return voie;
	}


	public int getNumero() {
		return numero;
	}
	
	
		
	
	
}
