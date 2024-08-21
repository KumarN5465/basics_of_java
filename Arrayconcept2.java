package PracticeProgram;

import java.util.Arrays;
 // array can store homogeneous value, it can store duplicate value, can update the array value, it cannot store heterogeneous, we can sort an array
public class Arrayconcept2 {
	public static void main(String []args) {
		int rollno[]= new int[3];
		
		rollno[0]= 71;
		rollno[1]= 81;
		rollno[2]= 91;
		System.out.println(rollno[1]); //first method to print the array
		System.out.println(Arrays.toString(rollno)); // second method to print the array
		for(int i=0;i<=2;i++) { 
			System.out.println(rollno[i]); // third method to print the array
			
		}
		String name[]=new String[3];
		name[0] = "Kumar";
		name[0] = "Anusha"; // updating an array value
		name[1] = "Yojana";
		System.out.println(Arrays.toString(name));
		
int rollno2[]= new int[3];
		
		rollno2[0]= 71;
		rollno2[1]= 31;
		rollno2[2]= 21;
		Arrays.sort(rollno2);
		System.out.println(Arrays.toString(rollno2));
		
	}

}
