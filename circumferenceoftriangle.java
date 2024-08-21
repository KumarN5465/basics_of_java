package BasicsPrograms;

import java.util.Scanner;

public class circumferenceoftriangle {
	public static void main(String []args) {
		Scanner ct1 =new Scanner(System.in);
		System.out.println("enter value of a");
		double a = ct1.nextInt();
		System.out.println("enter value of b");
		double b = ct1.nextInt();
		System.out.println("enter value of c");
		double c = ct1.nextInt();
		double circumferenceoftriangle = a+b+c;
		System.out.println("circumference of triangle is "+ circumferenceoftriangle);
		ct1.close();
		
		
	}


}
