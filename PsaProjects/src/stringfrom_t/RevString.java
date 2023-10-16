package stringfrom_t;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println(name);
		//System.out.println(name.length());
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}

	}

}
