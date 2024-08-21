package BasicsPrograms;

import java.util.Arrays;

public class String_toChatAT2 {
	static int count_of_alphabet=0;
	static int count_of_number=0;
	static int count_of_space=0;
	public static void main(String []args) {
		String Name_input = "my name123 is kumar124";
		char c1[]=Name_input.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println("Finding alphabet");
		for(int i=0;i<Name_input.length();i++)
		{
		boolean output = Character.isAlphabetic(c1[i]);
		//System.out.println(output);
		if(output==true) {
			count_of_alphabet++;
		}
		}
		System.out.println(count_of_alphabet);
		
		System.out.println("Finding number");
		for(int i=0;i<Name_input.length();i++)
		{
		boolean output = Character.isDigit(c1[i]);
		//System.out.println(output);
		if(output==true) {
			count_of_number++;
		}
		}
		System.out.println(count_of_number);
		
		System.out.println("Finding space");
		for(int i=0;i<Name_input.length();i++)
		{
		boolean output = Character.isSpaceChar(c1[i]);
		//System.out.println(output);
		if(output==true) {
			count_of_space++;
		}
		}
		System.out.println(count_of_space);
		
	}
}
