package firstclass;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
		//System.out.println(10/0);  // Arithmetic Exception
		
		//String s = null;
		//System.out.println(s.length());  // Null Pointer Exception
		
		//Scanner obj = new Scanner(System.in);
		//int age = obj.nextInt();      // Input mismatch Exception
		
		int[] outof = {1,2,3,4,5};
		System.out.println(outof[8]);   // Array index out of bound Exception

	}

}
