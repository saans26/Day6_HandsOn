/*
 * 1)Write a Java program to create an ArrayList, add all the months of a year and print the same.
 */

package Day6;

import java.util.ArrayList;
import java.util.List;

public class P9 {

	public static void main(String[] args) 
	{
		List<String> al = new ArrayList();
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("Augest");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		
		System.out.println("ArrayList size - " + al.size());
		for(int i = 0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
