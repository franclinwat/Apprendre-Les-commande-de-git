package Map;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(55);
		hs.add("kbdkj");
		hs.add('l');
		
		Iterator it = hs.iterator();
	
		
		while(it.hasNext());
		System.out.println(it.next());
		
		 System.out.println("\nParcours avec un tableau d'objet");
		    System.out.println("-----------------------------------");
		                
		    Object[] obj = hs.toArray();
		    for(Object o : obj)
		      System.out.println(o);

	}

}
