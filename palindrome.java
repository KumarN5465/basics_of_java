package BasicsPrograms;

public class palindrome {
	public static void main(String []args) {
		String Name ="RADAR";
		String output ="";
		for(int i=4;i>=0;i--) {
		char c1 =Name.charAt(i);
		output = output+c1;
		}
		System.out.println(output);
		if(Name.equals(output)) {
			System.out.println("String is palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}
