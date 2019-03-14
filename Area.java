/*

 *Area.java
 * Author	: Diana Ramirez
 * Created	: 03.12.19
 * Desc		: This program implements area functions/methods
 * Modified	: 03.14.19
 */

import java.util.Scanner;
public class Area {
							// Scanner object
	static Scanner input = new Scanner(System.in);
	
	/*
	 * getRectArea : int
	 * params : width: int, length: int
	 * calculates rectangle area
	 */
	public static int getRectArea( int width, int length) {
		return width * length;
	}
	
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
	
	public static double getCircArea(double PI, double r) {
		return Math.PI*r*r;
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

		//for debugging
		public static void main(String[] args) {
			rectArea();//Function call/invocation
			circArea();
			triArea();
			////
			System.out.println("Today code");
			System.out.println("Enter width and length: ");
			int width = input.nextInt();
			int length = input.nextInt();
		
			int area = getRectArea(width,length);
		
			System.out.println("Area: " + area);	
			
			
			System.out.println("Enter radius: ");
			double r = input.nextDouble();
					
			double carea = getCircArea(r, Math.PI);
			
			System.out.println("Area: " + carea );		
			
			
			System.out.println("Enter base and height: ");
			
			double b = input.nextInt();
			double h = input.nextInt();
		
			double tarea = getTriArea(b, h);
		
			System.out.println("Area: " + tarea);		
	}		
		
		public static double getTriArea( double base, double height) {
			return (base * height)/2;
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
		

}
