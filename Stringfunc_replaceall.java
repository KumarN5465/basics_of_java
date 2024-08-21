package BasicsPrograms;

public class Stringfunc_replaceall {
	public static void main(String []args) {
		String a ="manish";
		String b ="Manish Kumar Tiwari";
		String c ="Avinash Yadav";
		String d ="Aniths Reddy";
		String e ="Aniths123 Reddy346";
		System.out.println(a.replace("m", "z"));
		System.out.println(b.replace(" ", ""));
		System.out.println(c.replaceAll("[A-Z]", ""));
		System.out.println(d.replaceAll("[a-z]", ""));
		System.out.println(e.replaceAll("[0-9]", ""));
	}

}
