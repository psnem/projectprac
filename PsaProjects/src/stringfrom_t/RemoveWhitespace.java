package stringfrom_t;

import java.util.Scanner;

public class RemoveWhitespace {
	public static void removeWhiteSpaces(String str) {
		StringBuilder str2=new StringBuilder();
		char c;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				continue;
			else {
				c=str.charAt(i);
				str2.append(c);
				}
		}
		System.out.print(str2);
	}

	public static void main(String[] args) {
		System.out.println("Enter the message");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		removeWhiteSpaces(str);
	}

}
