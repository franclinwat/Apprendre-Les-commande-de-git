package Map;

import java.util.ArrayList;
import java.util.List;

public abstract class Animale {

	private String nom;
	private String prenom;
	private static List <Animale> nombreAnimal;
	
	public Animale(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public static void initAnimalList() {
		nombreAnimal= new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public <T extends Animale>  void ajouteAnimal(T animale){
		Animale.nombreAnimal.add( animale );
	}
	
	public abstract void parle();

	
	public List<Animale> getNombreAnimal() {
		return Animale.nombreAnimal;
	}

	public void setNombreAnimal(List<Animale> nombreAnimal) {
		Animale.nombreAnimal = nombreAnimal;
	}


	@Override
	public String toString() {
		return " Animale [nom=" + nom + ", prenom=" + prenom + "]";
	}

	public void ajouteAnimal() {
		
	}
	
}
