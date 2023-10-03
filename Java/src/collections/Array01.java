package collections;

import java.util.ArrayList;

public class Array01 {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Black");
		color.add("Brown");
		color.add("Yellow");
		color.add("red");
		System.out.println(color);
		color.set(0, "Grey");
		System.out.println(color);
		System.out.println(color.get(2));
		color.remove(3);
		System.out.println(color);
	}

}
