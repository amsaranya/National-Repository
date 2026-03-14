package ExceptionDemo;

public class DemoOfThrow2 {

	public static void main(String[] args)
	{
		
		int age = 10;

		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
//if we dont know which is actualy the exception is..
		try
		{
			throw new Exception("hello not eligible");
		}
		catch(Exception e)
		{
			System.out.println("failed");
			System.out.println(e.getMessage());
		}

	}

}
