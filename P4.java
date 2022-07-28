/*
 * 5) Write a Program with a division method which receives two integer numbers and performs the division operation.
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.

 */

package Day6;

import java.util.Scanner;

public class P4 {
	
	public void divide(int n, int d)
	{
		double c = n/d;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numerator :");
		int num = sc.nextInt();
		System.out.println("Enter Denominator :");
		int den = sc.nextInt();
		int b = Integer.parseInt(args[0]);
		try
		{
			P4 o = new P4();
			o.divide(num, den);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.toString());
		}

	}

}
