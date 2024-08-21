package PracticeProgram;

public class Constructors {// constructors are special type of methods in java which doesn't have return type
							//Access specifier,modifier, method name,para or non para
							//constructors are always non static
							//they will always have the same name as class name
							//it can have any access specifier
							//how to call constructors - by creating object, moment we create object constructor will get called automatically
							//two types of constructors 1) parameterized 2)non-parameterized
							//constructor overloading - creating multiple constructors but variation in argument list
	Constructors()
	{
		System.out.println("I am a Constructor");
	}
	Constructors(int a)
	{
		System.out.println("I am a Constructor overloading");
	}
	Constructors(String g, boolean f)
	{
		System.out.println("I am a 2 Constructor overloading");
	}
	
	public static void main(String[] args) { 
		new Constructors(); //method one
		Constructors c1=new Constructors();// method two
		new Constructors(100); // constrcutor overloading
		Constructors c2=new Constructors("kumar", true);
	}

}
