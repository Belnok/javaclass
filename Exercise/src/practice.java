import java.util.Scanner;

public class practice 
{
	public static void main (String []args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Input the degree in Farenheit:");
		
		double Farenheit = input.nextDouble ();
		double celsius = (5 *(Farenheit - 32)/9);
		
		System.out.println(Farenheit + " in degree Farenheit is :" + celsius + " in degree celsius");
		
	}
}