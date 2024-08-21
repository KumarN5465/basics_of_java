package BasicsPrograms;

public class MyContructors {
	
	MyContructors(){
		System.out.println("I am a new constrcutor");
	}
	MyContructors(int c){
		System.out.println("I am a new constrcutor with parameters");
	}
	MyContructors(int c, String b){
		System.out.println("I am a new constrcutor with 2 parameters");
	}
	
	public static void main(String[]args) {
		
		//MyContructors c1=new MyContructors();
		new MyContructors();
		new MyContructors(100);
		new MyContructors(55, "Kumar");
	
		
	}

}
