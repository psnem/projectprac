package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class RevisionPage 
{	
	public static void loop(int n)
	{
		if(n==0)
			return;
		n--;
		System.out.println("Done");
		loop(n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		loop(n);
		
	}

	}
