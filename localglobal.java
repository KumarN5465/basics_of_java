package PracticeProgram;

public class localglobal {
	static int global=100;
	boolean value;
	static void add() {
		double local=19.2;
		System.out.println(local);
	}
	public static void main(String []args) {  
		global=99; // updated the static value from 100 to 99
		System.out.println(global);
		add();
		localglobal g1= new localglobal();
		g1.value=true; // updated the non static value from default to true
		System.out.println(g1.value);
	}

}
