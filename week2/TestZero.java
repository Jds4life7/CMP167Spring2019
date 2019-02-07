/* 
 * Diana Ramirez
 * Feb. 7, 2019
 * Finding the average of three numbers.
 */
import java.util.Scanner;

public class TestZero {
	public static void main (String[] args) {
		
	Scanner scnr = new Scanner(System.in);
    int num1;
	int num2;
	int num3;
	int numAvg;
	
	 num1 = scnr.nextInt();
	 num2 = scnr.nextInt();
	 num3 = scnr.nextInt();
     numAvg = (num1 + num2 + num3)/3;
     
	System.out.print("The ");
	System.out.print("average ");
	System.out.print("of: ");
	System.out.print(num1);
	System.out.print(num2);
	System.out.print(num3);
	System.out.print("is: ");
	System.out.println(numAvg);
	}

}
