/*
 * 1) Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output).
Sample input and output 1:
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.
 */

package Day6;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter key :");
		String s = sc.nextLine();
		
		try
		{
			a = Integer.parseInt(s);
			double t = Math.pow(a, 2);
			System.out.println("Square : " + t);

		}
		catch(NumberFormatException aioe)
		{
			//System.out.println(aioe.toString());
			System.out.println("Enter Input is not valid");
		}
		

	}

}
