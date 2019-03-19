/*
 * Review.java
 * Author	:Diana Ramirez	
 * Created	:03.19.19
 * Desc		:Create a program that differentiates between
 * 			 a Miss and a Mister.	
 * 			 Review for Midterm
 */

import java.util.Scanner; 
public class Review {
							// scanner object created
	static Scanner scnr = new Scanner(System.in); 
	
	public static void greet() {
		System.out.println("\t\tWELCOME TO ETIQUETTE!!");
	}
	public static void title() {
     System.out.println("What's your name?");
     String name = scnr.next();
     greet(); // Function call
     
     if (name.endsWith("a") || name.endsWith("e")) {
    	 System.out.println("Miss " + name);
     }
     else
    	 System.out.println("Mister " + name);
	}
	 public static void greetPeople(int numPeople) {
		 for(int i = 0; i < numPeople; i++);
		 title();
	 }
	public static void main(String[]args) {
		System.out.println("Enter number of people");
		int num = scnr.nextInt();
		greetPeople(num);
	 }
}