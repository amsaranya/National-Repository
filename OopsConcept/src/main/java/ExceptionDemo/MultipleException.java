package ExceptionDemo;

public class MultipleException {

	public static void main(String[] args) 
	{
	try 
	{
		int a[] = new int[5];
		a[5] = 10/0;
	}
		
	
	catch(ArrayIndexOutOfBoundsException e)	
	{
		System.out.println("array index exception happend: " + e);
	}
		
	catch(ArithmeticException ae)
	{
		System.out.println("arthemetic exception happends : " + ae);
	}
		
		catch(Exception ee)
	{
			System.out.println(ee);
	}
		
	}

}
