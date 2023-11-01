package exceptionHandling;

import java.util.Scanner;

public class CustExcep {
	public static void main(String[] args) throws KaminaFoundException {
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		if (name.equals("nikhil")) {
			try {
				throw new KaminaFoundException();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else
			System.out.println("Good friend!!!!!!");

	}

}
