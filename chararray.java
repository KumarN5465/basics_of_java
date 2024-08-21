package PracticeProgram;

import java.util.Arrays;

public class chararray {
	static int count_of_alphabet=0;
	static int count_of_number=0;
	static int count_of_space=0;

	public static void main(String[] args) {
		String name = "Anusha is a good girl in class 12";
		char []c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println("Finding alphabet");
		for(int i=0;i<name.length();i++)
		{
		boolean output = Character.isAlphabetic(c1[i]);
		//System.out.println(output);
		if(output==true) {
			count_of_alphabet++;
		}
		}
		System.out.println(count_of_alphabet);
		System.out.println("Finding number");
		for(int i=0;i<name.length();i++)
		{
		boolean output = Character.isDigit(c1[i]);
		//System.out.println(output);
		if(output==true) {
			count_of_number++;
		}
		}
		System.out.println(count_of_number);
		System.out.println("Finding space");
		for(int i=0;i<name.length();i++)
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
