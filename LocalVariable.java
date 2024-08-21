package BasicsPrograms;

public class LocalVariable {
	static void add() {
		int a = 10;
		int b= 20;
		int add=a+b;
		System.out.println(add);
		
	}
	 void mul() {
		int a = 10;
		int b= 20;
		int multi=a*b;
		System.out.println(multi);
		
	}
	public static void main(String []args) {
		add();
		LocalVariable m1=new LocalVariable();
		m1.mul();
	}

}
