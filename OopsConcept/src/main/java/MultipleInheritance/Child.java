package MultipleInheritance;

public class Child implements FirstParent, SecondParent
{

	public static void main(String[] args)
	{
		
Child c = new Child();
c.method1();
c.method2();
c.methos3();
	}
	
	public void methos3()
	{
		System.out.println("This is child method3");
	}

	@Override
	public void method2() {
		System.out.println("This is method2 of parent2");
		
	}

	@Override
	public void method1() {
	
		System.out.println("This is method1 of parent1");
		
		
	}

}
