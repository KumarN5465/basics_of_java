package PracticeProgram;
class parent
{
	static void add() {
		
	}
	static void sub() {
		
	}
	void mul() {
		
	}
	void div() {
		
	}
}

public class typecasting_assignment extends parent
{
	static void add1() {
		
	}
	static void sub1() {
		
	}
	void mul1() {
		
	}
	void div1() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1 =	new typecasting_assignment();
		p1.add();
		p1.sub();
		p1.mul();
		p1.div();
		typecasting_assignment t1 = (typecasting_assignment) new parent();
		t1.div1();
		t1.sub1();
		t1.mul1();
		t1.add1();
		t1.div();
		t1.add();
		t1.sub();
		t1.mul();

	}

}
