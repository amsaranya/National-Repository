package ExampleOfAbstract;

public class DemoChild extends DemoParent
{

	public static void main(String[] args) 
	{
		DemoChild d = new DemoChild();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
		
		DemoParent e = new DemoChild(); //upcasting
		e.method1();
		e.method2();
		e.method3();

	}
	
	public void method4()
	{
		System.out.println("prining method4 of child");
	}

	@Override
	public void method3() 
	{
		System.out.println("prining method3 of child");
		
	}

}
