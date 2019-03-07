package week6;

/*
 * Average.java
 * Author:	Diana Ramirez
 * Created:	 03.07.19
 * Desc:	This program prints out the average of nth numbers using the for loop
 */

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Average");
		System.out.println("\tThis program calculates the average first nth numbers");
		
		System.out.println("Please enter the value of n:");
		int n		= input.nextInt();
		int sum = 0;
		
		System.out.println("\n*******************************");
		// Calculate the sum
		for(int i = 1; i <= n; i++) 
			sum += i;
		//Calculate the average
		int average = sum/n;
		//output the result 
			System.out.println("The average is " +average);
			
			System.out.println("*******************************");
		
		
	}

}
