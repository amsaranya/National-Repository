package Polymorphism;

public class CompileTimePoly {
	
	
	public void method1(String name, String password)
	{
		System.out.println(name);
		System.out.println(password);
	}
	
	public int method2(int a, int b, int d)
	{
	int sum = a+b+d;	
	return sum;
	}
	
	public static void main(String[] args) 
	{
		CompileTimePoly c = new CompileTimePoly();
		c.method1("saranya", "123");
		c.method2(10, 20, 30);

	}

}
