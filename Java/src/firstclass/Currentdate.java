package firstclass;

import java.time.LocalDateTime;

public class Currentdate {
	
	public static void main (String[]args) {
		
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Current date: "+ obj);
	}

}
