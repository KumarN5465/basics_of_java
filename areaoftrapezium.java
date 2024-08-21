package BasicsPrograms;

import java.util.Scanner;

public class areaoftrapezium {
	public static void main(String []args) {
		Scanner cr1 =new Scanner(System.in);
		System.out.println("enter value of a");
		double a = cr1.nextInt();
		System.out.println("enter value of b");
		double b = cr1.nextInt();
		System.out.println("enter value of h");
		double h = cr1.nextInt();
		double areaoftrapezium = (a+b)*h/2;
		System.out.println("area of trapezium "+ areaoftrapezium);
		cr1.close();
		
		
	}

	
}
