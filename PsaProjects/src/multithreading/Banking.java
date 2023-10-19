package multithreading;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Russian r=new Russian();
		r.start();
		int bal=10000;
		while(bal!=0) {
			System.out.println("Welcome to MYBANK\n Press D for Deoposit,Press W for Withdrawl\n Press B for Balance");
			Scanner sc=new Scanner(System.in);
			
			String ch=sc.next();
			switch(ch) {
			case "D":
				System.out.println("Enter the amount");
				int amt=sc.nextInt();
				bal+=amt;
				break;
			case "W":
				System.out.println("Enter the amount");
				amt=0;
				amt=sc.nextInt();
				bal-=amt;
				break;
			case "B":
				System.out.println(bal);
				
			}
		}
		System.out.println("Balance is empty");

	}

}
