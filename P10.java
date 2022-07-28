/*
 * 2) Create an ArrayList that can store only Strings.
Create a printAll method that will print all the elements of the ArrayList using an Iterator.


 */

package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class P10 {
	
	public static void printAll(List<String> l )
	{
		Iterator<String> it = l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<>();
		al.add("Sanskruti");
		al.add("Shruti");
		al.add("Vaibhav");
		al.add("Sanjog");
		
		printAll(al);

	}

}
