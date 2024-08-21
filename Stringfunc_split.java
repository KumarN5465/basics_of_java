package BasicsPrograms;

import java.util.Arrays;

public class Stringfunc_split {
	public static void main(String []args) {
		String a = "Kumar Reddy kishore";
	String []name=	a.split(" ");
		
		System.out.println(Arrays.toString(name));
		String []name2=	a.split(" ", 2);
		System.out.println(Arrays.toString(name2));
	}

}
