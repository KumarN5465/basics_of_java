package PracticeProgram;

public class String_functions {
	public static void main(String []args) {
		String a ="Kumar"; //one way
		String s1 = new String("  BANGLORE in india "); // another way
		System.out.println(a.length());// length
		System.out.println(s1.charAt(4)); //index position
		System.out.println(s1.indexOf('G'));// index of char
		System.out.println(s1.toLowerCase()); //lower case
		System.out.println(s1.toUpperCase()); //upper case
		System.out.println(s1.substring(4)); //substring (single parameter)
		System.out.println(s1.substring(1, 6)); //substring (double parameter)(6-1)
		System.out.println(s1.trim()); //Trim removes spaces start of the string and end of the string but not middle of the string
	
	}

}
