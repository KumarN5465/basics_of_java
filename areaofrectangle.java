package BasicsPrograms;

import java.util.Scanner;

public class areaofrectangle {
	public static void main(String []args) {
		Scanner r1 =new Scanner(System.in);
		System.out.println("enter value of l");
		double l = r1.nextInt();
		System.out.println("enter value of b");
		double b = r1.nextInt();
		double areaofrectangle = l*b;
		System.out.println("area of rectangle is "+ areaofrectangle);
		r1.close();
		
		
	}

}
