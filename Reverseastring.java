package BasicsPrograms;

public class Reverseastring {
	public static void main(String []args) {
		String Name ="Hari";
		String output ="";
		for(int i=3;i>=0;i--) {
		char c1 =Name.charAt(i);
		output = output+c1;
		}
		System.out.println(output);
	}

}
