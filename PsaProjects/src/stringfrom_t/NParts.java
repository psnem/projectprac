package stringfrom_t;

import java.util.Scanner;


public class NParts {
	public static void intoNParts(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the message");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		intoNParts(str);


	}

}
