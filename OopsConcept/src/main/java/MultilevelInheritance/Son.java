package MultilevelInheritance;

public class Son extends Father
{

	public static void main(String[] args) 
	{
	
		Son s = new Son();
		s.grandone1();
		int b = s.grandone3();
		System.out.println(b);
		s.father1();
		s.child1();
		

	}
	
	public void child1()
	{
		System.out.println("printing child1");
	}

	public void child2()
	{
		System.out.println("printing child2");
	}

}
