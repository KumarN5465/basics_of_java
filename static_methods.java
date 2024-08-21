package PracticeProgram;

public class static_methods {
	static void addition(){
		int a = 10;
		int b=20;
		int sum = a+b;			// we can call static method with its method name
		System.out.println(sum);
	}
	static void subtraction(){
		int a = 10;
		int b=20;
		int sub = a-b;
		System.out.println(sub);
	}
	public static void main(String []args) {
		
		addition();
		subtraction();
	}

}
