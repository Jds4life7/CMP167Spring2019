/*
 *Area.java
 * Author	: Diana Ramirez
 * Created	: 03.12.19
 * Desc		: This program implements area functions/methods
 */

import java.util.Scanner;
public class Area {
							// Scanner object
	static Scanner input = new Scanner(System.in);
	/*
	 * rectArea : void
	 * inputs : width and length
	 * process : area = width * length
	 * output : area
	*/
	public static void rectArea () {
		int width;
		int length;
		int area;
		
		System.out.println("Let's calculate the area ");
		// input
		System.out.println("Enter the width: ");
		width = input.nextInt();
		
		System.out.println("Enter the length: ");
		length = input.nextInt();
		// process/calculations
		area = width * length;
		// output
		System.out.println("The rect area is " + area);
	}
// Circle Area
	/*
	 * circArea : void
	 * inputs : radius
	 * process : area = pi * r * r
	 * output : circle area
	*/
	public static void circArea () {
		double r;
		double pi = 3.14159265359;
		double area;
		
		System.out.println("Let's calculate the area ");
		// input
		System.out.println("Enter the radius: ");
		r = input.nextDouble();
		
		// process/calculations
		area = pi *( r * r);
		// output
		System.out.println("The circ area is " + area);
	}
	
// Triangle Area
		/*
		 * triArea : void
		 * inputs : height, base
		 * process : area = (height * base) /2
		 * output : triangle area
		*/
		public static void triArea () {
			double height;
			double base;
			double area;
			
			System.out.println("Let's calculate the area ");
			// input
			System.out.println("Enter the height: ");
			height = input.nextDouble();
			System.out.println("Enter the base: ");
			base = input.nextDouble();
			
			// process/calculations
			area = (height * base) / 2 ;
			// output
			System.out.println("The triangle area is " + area);
		}
		
		// for debugging
		public static void main(String[] args) {
			rectArea();//Function call/invocation
			circArea();
			triArea();	
		}
			
		}
	

