package ExceptionDemo;

import AutomaticClassCreation.VotingAgeException;

public class ExampleOfThrows {

	public static void main(String[] args) throws VotingAgeException
	{
		int age = 10;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new VotingAgeException("not eligible to vote");
			
		}
		
	}

}
