package Day6;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=2; i++)
		{
			System.out.println("Enter " + i +" Student name :");
			String name = sc.nextLine();
			
			System.out.println("Maths");
			float math = sc.nextFloat();
			System.out.println("English");
			float eng = sc.nextFloat();
			System.out.println("Science");
			float sci = sc.nextFloat();
		
			float avg = (math+eng+sci)/3;
			System.out.println("Average of " + name + " is " + avg);
		}
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	
	}

}
