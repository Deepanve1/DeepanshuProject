package Assignment;

public class Student 
{
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}	
	public static void main(String[] args)
	{
		Student stu1 = new Student();
		stu1.display1();
		stu1.age=25;
		stu1.rollno=12;
		stu1.display2();
		System.out.println("Age is:" +stu1.age);
		System.out.println("Roll no is:" +stu1.rollno);
		
	}
}
