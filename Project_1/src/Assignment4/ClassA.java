package Assignment4;

public class ClassA 
{
	public void Method()
	{
		this.Method3();
		System.out.println("Default method");
		this.Method2();
		this.Method4();
		this.Method1();
	}
	public void Method1()
	{
		System.out.println("one parameterized method");
	}
	public void Method2()
	{
		System.out.println("two parameterized method");
	}
	public void Method3()
	{
		System.out.println("three parameterized method");
	}
	public void Method4()
	{
		System.out.println("four parameterized method");
	}
	public static void main(String[] args) 
	{
		ClassA obj = new ClassA();
		obj.Method();
		
		
	}
}
