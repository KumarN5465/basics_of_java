package BasicsPrograms;

import java.util.Scanner;

public class areacirle {
	public static void main(String []args) {
		Scanner c2	=new Scanner(System.in);
		System.out.println("enter value of a");
		int a = c2.nextInt();
		double pi =3.14*a*a;
		System.out.println("area of circle is " +pi);
		c2.close();
	}
}
