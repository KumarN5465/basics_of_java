package BasicsPrograms;

import java.util.Scanner;

public class arithmeticoperations {
	public static void main(String []args) {
		Scanner s1	=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s1.nextInt();
		System.out.println("enter value of b");
		int b=s1.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*+b;
		int div=a/b;
		int mod=a%b;
		System.out.println("sum of two number is"+sum);
		System.out.println("sum of two number is"+sub);
		System.out.println("sum of two number is"+mul);
		System.out.println("sum of two number is"+div);
		System.out.println("sum of two number is"+mod);
		s1.close();
	}

}
