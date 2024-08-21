package PracticeProgram;
class parentType //Downcasting- downcasting can never be performed without upcasting
{
	
}

public class classtypecasting2 extends parentType
{
	public static void main(String[] args) 
	{ 
		parentType p1 =new classtypecasting2(); // parent class properties
		parentType p2 = (parentType)new classtypecasting2();
		classtypecasting2 c1	=(classtypecasting2) p1;//Downcasting - explicitly - we can user properties of child class object now
		classtypecasting2 c2	=(classtypecasting2) p2;
	}

}
