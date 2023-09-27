package p5;

import java.util.Scanner;

public class Square {
	public void mysq(int x)
	{
		System.out.println(x*x);
	}
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);   //takes input
		System.out.println("Enter a number");    //show message
		int a=sc.nextInt();			// take input
		
		Square sq= new Square();
		sq.mysq(a);   // calling the function
	}

}
