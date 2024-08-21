package BasicsPrograms;
class Bank1{
	static void loginwithemail()
	{
		System.out.println("email id");
	}
}

public class singlelevelinherit1 extends Bank1
{
	
	static void loginwithephone()
	{
		System.out.println("Mobile number");
	}
	public static void main(String []args) {
		loginwithemail();
		loginwithephone();
	}
	
	
}
