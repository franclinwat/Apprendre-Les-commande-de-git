package collection.list.set.map.wat.com;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	
	    ArrayList al = new ArrayList();
	    al.add(12);
	    al.add("Une cha�ne de caract�res !");
	    al.add(12.20f);
	    al.add('d');
	                
	    for(int i = 0; i < al.size(); i++)
	    {
	      System.out.println("donn�e � l'indice " + i + " = " + al.get(i));
	    }               
	  }
	}


