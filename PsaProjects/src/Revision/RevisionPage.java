package Revision;

import java.util.Scanner;

class RevisionPage {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 2) {
			System.out.println("Not prime");
			System.exit(0);
		}
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if(count==1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
