package PracticeProgram;

public class typecastingwidening {
	public static void main(String []args) {
		int a = 100;
		double b1 = a; // converting int to double is called widening = implicit & explicit 
		System.out.println(b1);// primitive datatype - converting one datatype to another datatype
		int b = 100;
		double b2 = (double)b;
		System.out.println(b2);
		
		byte c= 27;
		short c1 = c;
		System.out.println(c1);// converting short to byte
		
	}

}
