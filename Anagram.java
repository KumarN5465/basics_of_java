package BasicsPrograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String []args) {
		String a = "angle";
		String b = "angel";
		if(a.length()!=b.length()) {
			System.out.println("not a anagram" );
			
		}
		else 
		{
		char []c1=	a.toCharArray();
		char []c2=	b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
			
		boolean output =	Arrays.equals(c1, c2);
		System.out.println(output);
		if(output==true) {
			System.out.println("strings are anagram" );
		}
		else {
			System.out.println("strings are not anagram" );
		}
			}
		
	}

}
