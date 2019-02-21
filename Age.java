/*
 * Author  :Diana Ramirez
 * Created :2.21.19
 * Desc	   :Program will ask the user for their age
 * 
 */

import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		int numAge;


		Scanner input = new Scanner(System.in);

		System.out.println("What is your age? ");
		numAge = input.nextInt();

		if(numAge > 25) {
			System.out.println("Adult");
		}	
		
		else if (numAge >= 19 && numAge <= 25) {
			
			System.out.println("Young Adult");
		}			
				
		else {
			System.out.println("Teen");

		}

	}

}
