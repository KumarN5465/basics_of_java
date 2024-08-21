package BasicsPrograms;

public class this_keyword {
	int age;
	String name;
	double Salary;
	void details(int age, String name, double Salary)
	{
		this.age=age; // it is to update the global value using local value, this keyword is only used in non static context, it can be used only global variable parameters are same as method parameters
		this.name=name;
		this.Salary = Salary;
	}
	public static void main(String []args) {
	this_keyword t1=	new this_keyword();
	t1.details(100, "sham", 33.33);
	System.out.println(t1.age);
	System.out.println(t1.name);
	System.out.println(t1.Salary);
	}
}
