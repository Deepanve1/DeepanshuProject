package Assignment3;

public class Constr1 
{
	public Constr1()
	{
		this(78,23,45.7F);
		System.out.println("Default Constructor");
	}
	public Constr1(int a)
	{
		System.out.println("One parameterized Constructor");
	}
	public Constr1(int a, int b)
	{
		System.out.println("Two parameterized Constructor");
	}
	public Constr1(int a, int b, float d)
	{
		System.out.println("Three parameterized Constructor");
	}
	public Constr1(int a, int b, float c, float d)
	{
		System.out.println("Four parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Constr1 obj = new Constr1();
		Constr1 obj1 = new Constr1(29);
		Constr1 obj2 = new Constr1(56,36);
		Constr1 obj4 = new Constr1(90,71,35.7F,75.5F);
		
	}
}
