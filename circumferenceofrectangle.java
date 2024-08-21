package BasicsPrograms;

import java.util.Scanner;

public class circumferenceofrectangle {
	public static void main(String []args) {
		Scanner cr1 =new Scanner(System.in);
		System.out.println("enter value of a");
		double a = cr1.nextInt();
		System.out.println("enter value of b");
		double b = cr1.nextInt();
		double circumferenceofrectangle = 2*(a+b);
		System.out.println("circumference of rectangle is "+ circumferenceofrectangle);
		cr1.close();
		
		
	}

}
