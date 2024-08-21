package BasicsPrograms;


public class This_calling_statement { ///it is used to call constructor from another constructor with in the same class, this has to be first line of every constructor and two types parameterized and non parameterized, this calling statement can be written explicitly
	This_calling_statement(int a)
	{
		System.out.println("Output1"); 
	}
	This_calling_statement(double b)
	{
		this(100);
		System.out.println("Output2");
	}
	This_calling_statement( )
	{
		this(33.55);
		System.out.println("Output3");
	}
	
	public static void main(String []args) {
		new This_calling_statement();
		
	}

}
//Note :Any constructor never be the combination of super calling and this calling statement
