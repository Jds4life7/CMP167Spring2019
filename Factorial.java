package week6;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Factorial");
		System.out.println("\tThis program calculates the factorial of first nth number");
		
		//gets input
		System.out.print("Please enter the value of n:");
		int n		= input.nextInt();
		int fact = 1;
		
		System.out.println("\n*******************************");
		// Calculate the factorial
		for(int i = 1; i <= n; i++) 
			fact *= i;
	
		//output the result 
		System.out.printf("The factorial of %d is %d%n ", n, fact);
			
		System.out.println("*******************************");
		
		

	}

}
