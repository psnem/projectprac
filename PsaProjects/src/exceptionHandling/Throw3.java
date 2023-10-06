package exceptionHandling;

import java.util.Scanner;

//A Class that represents use-defined exception

class MyException extends Exception {
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

//A Class that uses above MyException
public class Throw3 {
	// Driver Program
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name= sc.next();
		
		try {
			// Throw an object of user defined exception
			if(name=="piyush") 
			{
				throw new MyException("GeeksGeeks");
			}
			else
				System.out.println("You are ban ,"+name);
			
			
		}
		catch (MyException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}
