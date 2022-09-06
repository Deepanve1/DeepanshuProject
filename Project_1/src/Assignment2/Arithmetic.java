package Assignment2;

public class Arithmetic 
{
	public int sum(int a, int b)
	{
	int c;
	c = a+b;
	return c;
	}
	
	public int mul(int x, int y)
	{
	int z;
	z = x*y;
	return z;
	}
	public int sub(int p, int q)
	{
	int r;
	r = p-q;
	return r;
	}
	public int div(int i, int j)
	{
	int k;
	k = i/j;
	return k;
	}
	
	public static void main(String[] args)
	{
		//((((10+2)+2)*2)-2)/2)
		Arithmetic obj = new Arithmetic();
		int sumResult=obj.sum(10,2);
		int sumResult2=obj.sum(sumResult,2);
		int mulResult=obj.mul(sumResult2, 2);
		int subResult=obj.sub(mulResult, 2);
		int divResult=obj.div(subResult,2);
		System.out.println("The Result is:" +divResult);
		
		//((((10*2)-2)+2)-2)/2)
		
		int mulResult1=obj.mul(10,2);
		int subResult1=obj.sub(mulResult1,2);
		int sumResult3=obj.sum(subResult1, 2);
		int subResult2=obj.sub(sumResult3,2);
		int divResult1=obj.div(subResult2, 2);
		System.out.println("Second Result is:" +divResult1);
		
		
	}

}
