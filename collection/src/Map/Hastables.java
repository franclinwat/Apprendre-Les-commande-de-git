package Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hastables {

	
//	Une collection de type Map est une collection qui fonctionne avec un couple cl� - valeur.
//	On y trouve les objets Hashtable, HashMap, TreeMap, WeakHashMap� La cl�, qui sert � identifier
//	une entr�e dans notre collection
	
	
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put(2,"printemp");
		ht.put(6,"autone");
		ht.put(77,"et�");
		ht.put(87,"hiver");
		
		Enumeration e= ht.elements(); 
		
		while(e.hasMoreElements());
		
		System.out.println(e.nextElement());
		

	}

}
