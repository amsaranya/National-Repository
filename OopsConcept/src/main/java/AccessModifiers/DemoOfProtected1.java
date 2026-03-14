package AccessModifiers;

import pakageForPublic.ClassOfProtected;

public class DemoOfProtected1 extends ClassOfProtected
{
	protected void method3()
	{
		System.out.println("prining other class method3");
	}

	public static void main(String[] args) 
	{
		ClassOfProtected c3 = new ClassOfProtected();
//		c3.method1();

	}

}
