// Java program to demonstrate 
	// & operator as relational operator 
	  

	import java.io.*; 
	
public class AndOper {


	    public static void main(String[] args) 
	    { 
	  
	        int x = 5, y = 7, z = 9; 
	  
	        System.out.println("Demonstrating && operator"); 
	        if ((x > y) && (x++ > z)) 
	            ; 
	        else
	            System.out.println("Value of x: " + x); 
	  
	        System.out.println("\nDemonstrating & operator"); 
	        if ((x > y) & (x++ > z)) 
	            ; 
	        else
	            System.out.println("Value of x: " + x); 
	    } 
	} 


