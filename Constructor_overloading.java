package PracticeProgram;
public class Constructor_overloading {
	Constructor_overloading(int a)
	{
		System.out.println("Output1"); 
	}
	Constructor_overloading(double b)
	{
		this(100);
		System.out.println("Output2");
	}
	Constructor_overloading( )
	{
		this(33.55);
		System.out.println("Output3");
	}
	public static void main(String []args) { 
		new Constructor_overloading();
		
	}
	

}
