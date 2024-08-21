package BasicsPrograms;
class first{
	void login() {
		System.out.println("login with mobile number");
	}
}
public class Methodoveriding extends first
{
	void login() {
		super.login();
		System.out.println("login with email ID");
		
	}
	public static void main(String []args) {
		
		Methodoveriding m1= new Methodoveriding();
		m1.login();
	}

}
