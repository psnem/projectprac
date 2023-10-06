package exceptionHandling;

import java.util.Scanner;

public class CustomeException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		
		try {
			String name=sc.nextLine();
			 
			//if(name.equals("piyush"))
			if(name.equals("piyush"))
			{
				throw new UserDefinedException("Sorry");
			}
			else
			System.out.println("Welcom ,"+name);
		}
		catch(UserDefinedException ude)
		{
			System.out.println(ude.getMessage());
		}
		

	}

}
