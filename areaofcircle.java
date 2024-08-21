package BasicsPrograms;

import java.util.Scanner;

public class areaofcircle {
	public static void main(String []args) {
		float pi=3.14f,ar;
		Scanner s	=new Scanner(System.in);
		System.out.println("enter value of radius");
		int rad = s.nextInt();
		ar =pi*rad*rad;
		System.out.println("Area of circle:" + ar);
		s.close();
		
	}
}
