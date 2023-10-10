package psarray;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if (num < 2) {
			System.out.println("Not prime");
			System.exit(0);
		}
		int flag = 0;
		for (int i = 1; i <= num; i++) {

			if (num % i == 0)
				flag++;

		}
	//	System.out.println(flag);
		if (flag == 2)
			System.out.println("Prime");
		else
			System.out.println("not prime");
	}
}
