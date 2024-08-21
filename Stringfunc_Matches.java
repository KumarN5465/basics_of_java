package BasicsPrograms;

public class Stringfunc_Matches {
	public static void main(String []args) {
		String a = "Ramu";
		System.out.println(a.matches("R(.*)"));
		System.out.println(a.matches("...."));
		System.out.println(a.matches("(.*)u"));
		System.out.println(a.matches("(.*)m(.*)"));
	}

}
