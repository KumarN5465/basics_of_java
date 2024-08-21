package PracticeProgram;

public class String_functions4 {

	public static void main(String[] args) {
		String name ="Anurag";
		String Output =" ";
				for(int i=5;i>=0;i--) {
			
			char a1 =	name.charAt(i); // to print the String in reverse i=5 output=0+g which is g
										//in the second iteration output will be i=4 output=g+a = ga like wise it will iterate 5 time and the final output will be garunA
			Output =Output+a1;
			
			}
				System.out.println(Output);
	}

}
