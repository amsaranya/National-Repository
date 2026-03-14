package SuperDemo;

public class Child extends Parent {
	
	int length = 10;
	public void childMethod()
	{
		System.out.println("child : " + length);
		System.out.println("parent : " + super.length);
	}

	public static void main(String[] args) 
	{
	
		Child c = new Child();
		c.childMethod();

	}

}
