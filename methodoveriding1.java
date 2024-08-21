package PracticeProgram;

class Youtube{
	Youtube(int a)
	{
		System.out.println("Output1");
	}
}
class Google extends Youtube
{
	Google()
	{
		super(100); // super calling statement should write explicitly when parametrized non static method 
		System.out.println("Output2");
	}
}

public class methodoveriding1 extends Google
{
	methodoveriding1()
	{
		System.out.println("Output3");
	}
	
	public static void main(String []args) {
		new methodoveriding1();
		
	}

}
