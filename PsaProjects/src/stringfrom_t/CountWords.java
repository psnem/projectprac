package stringfrom_t;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message");
		String msg=sc.nextLine();
		String m[]=msg.trim().split(" ");
		System.out.println(m.length);

	}

}
