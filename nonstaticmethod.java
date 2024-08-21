package BasicsPrograms;

public class nonstaticmethod {
	void add() {
	int a =10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
	}
	void mul() {
		int a =10;
		int b=20;
		int multiply=a*b;
		System.out.println(multiply);
		}
	static void sub() {
		int a =10;
		int b=20;
		int Subtraction=a-b;
		System.out.println(Subtraction);
		}
	 void div() {
		int a =10;
		int b=20;
		int divide=a/b;
		System.out.println(divide);
		}
	public static void main(String[]args ) {
		
		nonstaticmethod n1=new nonstaticmethod();
		n1.add();
		n1.mul();
		sub();
		n1.div();
		
	}
}
