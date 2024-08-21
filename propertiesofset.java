package PracticeProgram;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class propertiesofset {

	public static void main(String[] args) {
			Set s1=new HashSet();
			s1.add("Kumar");
			s1.add("Anusha");
			s1.add(99);
			s1.add(99);
			s1.add(false);
			s1.add(null);
			System.out.println(s1);
			Set s2=new HashSet();
			s2.add(12);
			s2.add(14);
			s2.add(55);
			s2.add(66);
			s2.add(63);
			s2.add(1);
			Collections.sort(s2);
			System.out.println(s2);
			
	}

}
