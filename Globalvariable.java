package BasicsPrograms;

public class Globalvariable {
	static String a = "Kumar";
	double pi =3.14;
	public static void main(String []args) {
		a = "Anusha";
		System.out.println(a);
		Globalvariable kumar =new Globalvariable();
		kumar.pi = 143;
		System.out.println(kumar.pi);
		
	}

}
