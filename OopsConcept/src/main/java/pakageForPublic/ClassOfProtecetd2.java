package pakageForPublic;

public class ClassOfProtecetd2 extends ClassOfProtected
{

	protected void method2()
	{
		System.out.println("prining method2");
	}

	public static void main(String[] args)
	{
		ClassOfProtected c1 = new ClassOfProtected();
		c1.method1();
		
	}
	
}
