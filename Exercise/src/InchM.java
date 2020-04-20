// a Java program that reads a number in inches, converts it to meters.

import java.util.Scanner;

public class InchM {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		 System.out.print("Input a value for inch:");
		 
		 double inch = input.nextDouble();
		 double meters = inch * 0.0254;
		 
		 System.out.println(inch + " inch is " + meters + " meters" );
		 
	
	}
}
