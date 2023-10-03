package collections;

import java.util.HashMap;
import java.util.HashSet;

public class Mapping {
	
	public static void main(String[]args) {
		
		//Hashmap
		
		HashMap<String,String> country = new HashMap<String,String>();
		
		country.put("Japan","Tokyo");
		System.out.println(country);
		
		//Hashset
		
		HashSet<String> game = new HashSet<String>();
	    
		game.add("Cricket");
		game.add("Basket ball");
		game.add("volly ball");
		System.out.println(game.contains("volly ball"));
	}

}
