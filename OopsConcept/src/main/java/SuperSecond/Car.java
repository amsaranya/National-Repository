package SuperSecond;

public class Car extends Vehicle
{
//method overriding
	public void colour(String colour)
	{
		super.colour("green");
		System.out.println("colur of child" + colour);
	}
	
	public static void main(String[] args) 
	{
		
Car c = new Car();
c.colour("Red");
	}

}
