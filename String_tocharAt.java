package BasicsPrograms;

import java.util.Arrays;

public class String_tocharAt {
	public static void main(String []args) {
		String Name_input = "my name123 is kumar124";
		char c1[]=Name_input.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println("Finding alphabet");
		for(int i=0;i<Name_input.length();i++)
		{
		boolean output = Character.isAlphabetic(c1[i]);
		System.out.println(output);
		}
		System.out.println("Finding number");
		for(int i=0;i<Name_input.length();i++)
		{
		boolean output = Character.isDigit(c1[i]);
		System.out.println(output);
		}
		System.out.println("Finding space");
		for(int i=0;i<Name_input.length();i++)
		{
		boolean output = Character.isSpaceChar(c1[i]);
		System.out.println(output);
		}
	}
}
