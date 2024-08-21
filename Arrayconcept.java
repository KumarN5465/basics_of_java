package PracticeProgram;

import java.util.Arrays;

public class Arrayconcept { ///array in java used to store the homogeneous value together
	public static void main(String []args) {
		//Syntax2
				//int a2[]= new int[0];
		
		//Syntax1
	int rollno[]= new int[3];
		rollno[0] = 21;
		rollno[1] = 22;
		rollno[2] = 32;
		System.out.println(Arrays.toString(rollno)); // storing the roll number using array
		
		String name[]=new String[3];
		name[0] = "Kumar";
		name[1] = "Anusha";
		name[2] = "Yojana";
		System.out.println(Arrays.toString(name)); // storing  the names using an array
		for(int i=0;i<=2;i++) { // second method
			System.out.println(name[i]);
			
		}
	
	}
}
