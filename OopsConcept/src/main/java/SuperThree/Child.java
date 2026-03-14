package SuperThree;

public class Child extends Parent{
	
	//constructor overloading wont happend

	public Child() 
	{
		super(10);
		System.out.println("I am child");
	}
	
	
	

	public static void main(String[] args) 
	{
		Child c = new Child();
		
	}

}
