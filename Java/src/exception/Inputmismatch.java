package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputmismatch {

	public static void main(String[] args) {
		
		   try {
			   Scanner obj = new Scanner(System.in);
		    int age = obj.nextInt();
		   }
		   catch(InputMismatchException e){
			   System.out.println("this is try catch");
		   }

	}

}
