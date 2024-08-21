package PracticeProgram;
 
	
public class methodoverloading1 {  //creating multiple methods with same name but variations in the argument list 
								   //number of arguments, order of occurrence argument, different type of arguments
							       //method overloading possible with both static and non static methods
								   //to call the non static method we should create the object using the class name
								   //static method can be called using the method name
								   //method means some kind of actions,eg:login with ph no or email id in application amazon or flipkart 
	void add(int a) {
		System.out.println("method 1");
	}
	void add(int a, double b) {
		System.out.println("method 2");
	}
	static void add(char c) {
		System.out.println("method 3");
	}
	static void add(String d) {
		System.out.println("method 4");
	}
	 void add(String e, double f, char g, int h) {
		System.out.println("method 5");
	}
	 void add(boolean b1) {
			System.out.println("method 6");
		}
	public static void main(String []args) {
		methodoverloading1 m1=new methodoverloading1();
		m1.add(50);
		m1.add(100, 18.9);
		add('c');
		add("Kumar");
		m1.add("Kumar",18.4, 'f', 56);
		m1.add(true);
	}

}
