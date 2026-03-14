package Polymorphism;

public class ChildRuntime extends AnimalRuntime
{

	public void sound(String sou)
	{
		System.out.println("sound of child is : " + sou);
	}
	public static void main(String[] args)
	{
	
//runtime polymorphism		
 ChildRuntime c = new ChildRuntime();
 c.sound("crying");
 
 //upcasting
 AnimalRuntime aa = new ChildRuntime();
 aa.sound("aa crying");
	}

}
