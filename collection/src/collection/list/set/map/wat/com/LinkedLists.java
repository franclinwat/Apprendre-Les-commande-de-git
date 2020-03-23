package collection.list.set.map.wat.com;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedLists {

	public static void main(String[] args) {

	List ld = new LinkedList();
	
	ld.add(12);
	ld.add("bonjour");
	ld.add(76);
	ld.add(9);
	
	for(int i = 0 ; i < ld.size() ; i++)
	
	
	 System.out.println("Élément à l'index " + i + " = " + ld.get(i));
		 System.out.println("\n \tParcours avec un itérateur ");
    System.out.println("-----------------------------------");
    ListIterator li = ld.listIterator();

    while(li.hasNext())
      System.out.println(li.next());
	

	}
}

