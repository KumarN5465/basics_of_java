package BasicsPrograms;

public class Nestedif {
	public static void main(String []args) {
		char gen1 = 'F';
		int age = 60;
		if(gen1=='F') {
			System.out.println("Travelling free");
		}
		else {
			if(age <=12) {
				System.out.println("Half Ticket");
			}
			else if(age>12 && age <=59) {
				System.out.println("Full ticket");
			}
			else {
				System.out.println("Senior citizen ticket");
			}
			
		}
	}

}
