
/*Operator  	Meaning
 _________		________
+ 	            Unary plus (not necessary to use since numbers are positive without using it)
-           	Unary minus; inverts the sign of an expression
++          	Increment operator; increments value by 1
-- 				decrement operator; decrements value by 1
! 				Logical complement operator; inverts the value of a boolean */



public class UnaryOP {
   
        public static void main(String[] args) {
        	
        	double number = 5.2, resultNumber;
        	boolean flag = false;
        	
        	System.out.println("+number = " + +number);
        	// number is equal to 5.2 here.
        	
        	System.out.println("-number = " + -number);
        	// number is equal to 5.2 here.
        	
            // ++number is equivalent to number = number + 1
        	System.out.println("number = " + ++number);
            // number is equal to 6.2 here.
            // -- number is equivalent to number = number - 1
        	System.out.println("number = " + --number);
            // number is equal to 5.2 here.
        	System.out.println("!flag = " + !flag);
        	// flag is still false.
        }
    }

