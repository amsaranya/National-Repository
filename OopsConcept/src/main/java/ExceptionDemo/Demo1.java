package ExceptionDemo;

public class Demo1 {

	public static void main(String[] args) 
	{
		try
		{
			int sum = 10/0;
			System.out.println(sum);
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println("exception : " + e);
		}*/
		
		finally
		{
			System.out.println("prining finally");
		}
		

	}

}
