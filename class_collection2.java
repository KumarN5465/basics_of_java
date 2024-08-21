package PracticeProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class_collection2 {

	public static void main(String[] args) {
		Collection c1 =new ArrayList(); // to get the methods of collection  method 1 - add
		c1.add("Kumar");//
		c1.add("Anusha");
		System.out.println(c1);
		c1.add(99);
		c1.add(100);
		System.out.println(c1);
		
		Iterator i1 = c1.iterator();// to use the iterator we need to write while loop for iteration method 8 iterator
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}	
		System.out.println(c1.size());// method 9 size
		
	boolean b1 =c1.contains("Kumar"); //method 10 contains
	System.out.println(b1);
	
	}
}
