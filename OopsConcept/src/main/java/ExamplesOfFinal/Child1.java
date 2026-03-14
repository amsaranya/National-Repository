package ExamplesOfFinal;

public class Child1  extends Parent1{
	
	public void method2()
	{
		System.out.println("method2 of child");
	}
	
	/*public void method1()
	{
		System.out.println("final method cannot be override");
	}*/

	public static void main(String[] args)
	{
		
		Child1 c = new Child1();
		c.method2();
		c.method1();
		
		
	}

}
