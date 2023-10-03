package array;

import java.util.Scanner;

public class Factorial {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        // Base case: factorial of 0 is 1
        if (number == 0 || number == 1) {
            return 1;
        } 
        
        else {
        	// Recursive call to calculate factorial
            return number * calculateFactorial(number-1);
        }
        
        

    }

}
