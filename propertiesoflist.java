package PracticeProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class propertiesoflist {

	public static void main(String[] args) {
		List l1 =new ArrayList(); // upcasting 
		l1.add("Kumar");
		l1.add("Anusha");
		l1.add(99);
		l1.add(99);
		l1.add(false);
		l1.add(null);
		System.out.println(l1);
		List l2 =new ArrayList(); // upcasting 
		l2.addAll(l1);
		l2.add("Yojana");
		System.out.println(l2);
		List l3 =new ArrayList(); // upcasting 
		l3.add(100);
		l3.add(44);
		l3.add(99);
		l3.add(98);
		l3.add(33);
		l3.add(12);
		Collections.sort(l3); //  Sorting 
		System.out.println(l3);
		Iterator i1 =l3.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		ListIterator i2 =	l3.listIterator();
		//forward iteration
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		
		
	}

}
