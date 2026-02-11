package Inheretance;

public class Child extends Parent
{

	public static void main(String[] args) 
	{
	
		Child c = new Child();
		c.childOwner();
		c.parentOwner();
		int num = c.ParentId(5);
		System.out.println("num is: " + num);
		
	}
	
	public void childOwner()
	{
		System.out.println("child class printing");
	}

}
