package firstclass;

import java.util.Scanner;

public class Userinput {
	
	public static void main (String[]args) {
		
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter your name");
		 
		 String name = obj.nextLine();
		 System.out.println("user name: " + name);
		 
		 System.out.println("Enter your age");
	     int age = obj.nextInt();
	     System.out.println("user age: " + age);
		 
		 boolean what = obj.nextBoolean();
		 System.out.println("Have you complet the work: "+ what);
	}

}
