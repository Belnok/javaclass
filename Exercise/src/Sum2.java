/* This is a Java Program to Compute the Sum of Digits in a given Integer.
 
 Solution :
 
 using  while loop 

n(n) = m(n-1) % 10
S(n) = S + n(n)
m(n) = m(n-1)/10


Enter any integer number as input. 
After that we use modulus and division operation respectively
to find the sum of digits of number as output.  */

import java.util.Scanner;

    public class Sum2 

    {
        public static void main(String args[])
        {
            int m, n, sum = 0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter the number:");

            m = s.nextInt();

            while(m > 0)
            {
                n = m % 10;

                sum = sum + n;

                m = m / 10;
            }

            System.out.println("Sum of Digits:"+sum);
        }
    }

