package PracticeProgram;

public class String_functions2 {
	public static void main(String []args) {
		String  name="Kamesh";
		String  name1="Kamesh";
		System.out.println(name.equals(name1)); // equals used to compare the two strings - return type is true or false
		
		String  name2="Kamesh";
		String  name3=" kumar";
		System.out.println(name2.concat(name3)); //Concat is used to combine the two strings 
		
		String  name4="Kamesh";
		String  name5="kamesh";
		System.out.println(name4.equalsIgnoreCase(name5));// equal ignore case used to ignore the case sensitive between strings
		
		String str = "Java"; 
		String str2 = "Java"; 
		System.out.println(str == str2);
		
		
	}

}
