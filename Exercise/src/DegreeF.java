// : a Java program which converts  temperature from Fahrenheit to Celsius degree.

import java.util.Scanner;

public class DegreeF {

	public static void main(String[] args){
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Input a degree in Farenheit :");
	
	
	
	double farenheit = input.nextDouble();
	double celsius = ((5*(farenheit - 32.0))/9);
	
	System.out.print(farenheit + "degree farenheit is equal to " + celsius + "in celsius");
	
	}

	}
	}
