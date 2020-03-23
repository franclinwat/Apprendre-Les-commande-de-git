package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class EtinerationMap {
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	public void affichierPays(){
		
		HashMap<String, String> Data=new HashMap<>();
		ArrayList<String> pays=new ArrayList<>(Data.keySet());
		Random random=new Random();
		String randomKeys=pays.get(random.nextInt(Data.size()));
		System.out.println(randomKeys);
		System.out.println(Data.get(randomKeys));
		
		
	}
	
	

	public  HashMap<String,String> getData(){
		
		HashMap<String, String> data=new HashMap<>();
		
		data.put("Cameroun", "yaounde");
		data.put("Nigeria", "Abudja");
		data.put("France", "Paris");
		data.put("USA", "new york");
		
		
		return data;
		
	}
}
