package BasicsPrograms;

public class methodoverloading {
	
	void add() {
		System.out.println(1);
	}
	void add(int a) {
	System.out.println(2);
		
	}
	void add(String b) {
		System.out.println(3);
			
		}
	static void add(boolean c) {
		System.out.println(4);
			
		}
	public static void main(String []args)
	{
		methodoverloading m1= new methodoverloading();
		m1.add(100);
		m1.add();
		m1.add("Kumar");
		add(true);
	}

}
