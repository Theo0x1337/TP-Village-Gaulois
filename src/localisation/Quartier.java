package localisation;

public class Quartier {

	private String nom;
	private String image; // la je met un string en type maus faut mettre une image en vrai 2 vrai
	
	
	public Quartier(String nom, String img) {
		this.image = img;
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
