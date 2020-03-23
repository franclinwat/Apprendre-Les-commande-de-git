package Map;

import java.awt.List;
import java.util.ArrayList;

public class Testgene1 {

	public static void main(String[] args) {
		//ArrayList<Animale> chat = new ArrayList<Animale>();
		//ArrayList<Chien> berge = new ArrayList<Chien>();
		Animale.initAnimalList();
		
		Animale an= new Chien(23,"jhqkjbc","kggkuh");
		System.out.println(an);
		an.parle();
		an.ajouteAnimal();
		//System.out.println(an.getNombreDeChien());
		System.out.println(an);
		
//		chat.add(new Animale());
//		chat.add(new Animale());
//		chat.add(new Animale());
//		
//		berge.add(new Chien());
//		berge.add(new Chien());
//		berge.add(new Chien());
//		berge.add(new Chien());
//		
		
		
		
		//lister(chat);
		//lister(berge);

	}
public static void lister(ArrayList<?> chat){
	for (Object animale : chat) {
		System.out.println(animale);
		
	}
}
}
