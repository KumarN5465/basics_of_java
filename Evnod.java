package BasicsPrograms;

import java.util.Scanner;

public class Evnod {
	public static void main(String []args) {
		Scanner s2	=new Scanner(System.in);
		System.out.println("enter value of a");
		int a =s2.nextInt();
		if(a%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		s2.close();
	}

}
