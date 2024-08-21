package BasicsPrograms;

import java.util.Scanner;

public class areaoftriangle {
	public static void main(String []args) {
		Scanner t1 =new Scanner(System.in);
		System.out.println("enter value of b");
		double b = t1.nextInt();
		System.out.println("enter value of h");
		double h = t1.nextInt();
		double areaoftriangle = (b*h)/2;
		System.out.println("area of triangle is " +areaoftriangle);
		t1.close();
	}

}
