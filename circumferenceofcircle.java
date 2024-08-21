package BasicsPrograms;

import java.util.Scanner;

public class circumferenceofcircle {
	public static void main(String []args) {
		final double pi = 3.14;
		Scanner c1 =new Scanner(System.in);
		System.out.println("enter value of r");
		double r = c1.nextInt();

		double c = 2*pi*r;
		System.out.println("circumference of circle is "+ c);
		c1.close();
		
		
	}

}
