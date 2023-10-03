package firstclass;

import java.util.Scanner;

public class User_exercise {
	
	public static void main(String[]args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter int1 and int2");
		int int1 = obj.nextInt();
		int int2 = obj.nextInt();
		
		System.out.println(int1*int2);
		System.out.println(int1+int2);
		System.out.println(int1-int2);
		System.out.println(int1/int2);
		System.out.println(int1%int2);
	}
	

}
