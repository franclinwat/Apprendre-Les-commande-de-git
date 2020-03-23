package Map;

import java.util.ArrayList;

public class Chien extends Animale {

	private int nombreDeChien;
	
	public Chien(String nom, String prenom) {
		super(nom, prenom);
	}

	public Chien(int nombreDeChien,String nom, String prenom) {
		super(nom, prenom);
		this.nombreDeChien = nombreDeChien;
	}

	public int getNombreDeChien() {
		return nombreDeChien;
	}

	public void setNombreDeChien(int nombreDeChien) {
		this.nombreDeChien = nombreDeChien;
	}
	

	@Override
	public void parle(){
		System.out.println("woooo woooo");
	}
	
	@Override
	public void ajouteAnimal(){
		super.ajouteAnimal(this);
		nombreDeChien++;
	}

	@Override
	public String toString() {
		return "Chien [nombreDeChien=" + nombreDeChien + ", toString()="+ super.toString() + "]";
	}
}
