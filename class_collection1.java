package PracticeProgram;

import java.util.ArrayList;
import java.util.Collection;

public class class_collection1  
{

	public static void main(String[] args) 
	{
		Collection c1 =new ArrayList(); // to get the methods of collection  methdod 1 - add
		c1.add("Kumar");//
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add("Anusha");
		c1.add(null);
		System.out.println(c1);
		c1.add(99);
		c1.add(100);
		System.out.println(c1);
		c1.add(false);
		c1.add(10.2);
		System.out.println(c1);
		System.out.println("------------------------------");
		Collection c2 =new ArrayList(); // to get the methods of collection  methdod 2 - addAll
		c2.addAll(c1);
		c2.add("Yojana");
		c2.add(102);
		System.out.println(c2);
		System.out.println("------------------------------");
		boolean b1=c2.equals(c1); // method 3 equals
		System.out.println(b1);
		System.out.println("------------------------------");
		boolean b2 = c1.isEmpty(); // method 4 isempty
		System.out.println(b2);
		System.out.println("------------------------------");
	/*	c1.clear(); // method 5 clear
		System.out.println(c1); */
		
		c1.remove(99); // method 6 remove
		System.out.println(c1);
		System.out.println("------------------------------");
		c2.removeAll(c1); // method 7 removeAll
		System.out.println(c2);
		System.out.println("------------------------------");
		boolean b3 =c2.containsAll(c1); //method 11 contains all
		System.out.println(b3);
		
		
	}

}
