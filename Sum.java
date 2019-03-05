/* Author: Diana Ramirez
 * Date: 03.05.19
 * week6
 * Desc: Sum of first n natural numbers 
 * 
*/

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		int counter=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the value of n: ");
 		n = input.nextInt();
 		
		
		while (counter < n) {
			counter++;
			System.out.println(counter);
			sum += counter;
		}
 		
 		System.out.println("The sum is: " + sum);
 		

	}

}
