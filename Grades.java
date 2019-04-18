/*
 * Author	: Diana Ramirez
 * Created	: 04.18.19
 * Desc		: A program that handles grades
 */


import java.util.Arrays;
import java.util.Scanner;
public class Grades {
	static Scanner scnr = new Scanner(System.in); 
	
	public static int readGrades(int[] grades) {
		/**
		 ** params: grades- the array that will hold the grades that are read in.
		 ** returns:The number of grades that were read from the user
		 **/
		int position=0;
		while(position < grades.length) {
			System.out.print("Enter a grade: ");
			int grade= scnr.nextInt();
			if (grade >= 0) {
			grades[position] = grade;
			position++;
			}
			else {
				break;
			}
		}
		return position;
	}
	public static void rotateElements(int[]arr) {
		/**
		 **params: arr- An array of int values.
		 **desc	: This method is used to rotate all the elements in arr one
		 **position to the right. This rotation will result in arr[0] moving
		 **to arr[1] and arr[1] moving to arr[2] ...
		 ** etc. Finally, arr[arr.length-1] moves to arr[0]
		 **
		 */
		
		for( int i=0; i<arr.length-1; i++) {
			/*if((i+1)==arr.length-1) {	
				arr[0]= arr[arr.length-1];
			}
		*/
		arr[i-1]= arr[i];
		}
		
	
	
	//debugging- for testing
	public static void main(String[] args) {
		int[] arr = new int[5];
		int size = readGrades(arr);
		System.out.println("The size of the array is currently: " + size);
		System.out.println(Arrays.toString(arr));
		rotateElements(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
