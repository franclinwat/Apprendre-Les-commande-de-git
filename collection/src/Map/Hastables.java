package Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hastables {

	
//	Une collection de type Map est une collection qui fonctionne avec un couple clé - valeur.
//	On y trouve les objets Hashtable, HashMap, TreeMap, WeakHashMap… La clé, qui sert à identifier
//	une entrée dans notre collection
	
	
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put(2,"printemp");
		ht.put(6,"autone");
		ht.put(77,"eté");
		ht.put(87,"hiver");
		
		Enumeration e= ht.elements(); 
		
		while(e.hasMoreElements());
		
		System.out.println(e.nextElement());
		

	}

}
