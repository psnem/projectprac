package stringfrom_t;

import java.util.Scanner;

public class CountChar {
	public static int countChar(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the message");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(countChar(str));
	}
}
