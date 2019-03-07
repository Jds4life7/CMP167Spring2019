package week6;
/*
 * Power.java
 * Author:	Diana Ramirez
 * Created:	 03.07.19
 * Desc:	This program prints out the first nth 
 * 			power of two using the for loop
 */
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Power");
		System.out.println("\tThis program calculates the nth powers of 2");
		
		System.out.println("Please enter the value of n:");
		int n		= input.nextInt();
		
		System.out.println("\n__________________________________");
		
		int power = 1;
		System.out.println(power);
		for(int i = 1; i <= n; i++) 
		{
			power = power*2;
			System.out.println(power);
		}
		
	}

}
