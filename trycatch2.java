package BasicsPrograms;

import java.util.Scanner;

public class trycatch2 {
	public static void main(String []args) {
		int arr[]=new  int[3];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of an array");
		try {
		for(int i=0;i<=4;i++) {
			arr[i]=s1.nextShort();
		}
		}
		catch(ArrayIndexOutOfBoundsException handled) {
			
			System.out.println("comehere");
		}
			
		s1.close();
	
		}

}
