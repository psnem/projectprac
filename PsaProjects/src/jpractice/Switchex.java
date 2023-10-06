package jpractice;

import java.util.Scanner;

public class Switchex {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		switch(key){
			case 0:
				System.out.println("follow a number");
				break;
			case 1:
				System.out.println("You are no 1");
				break;
			case 2:
				System.out.println("you are a pair");
				break;
			default:
				System.out.println("you are done");
		}
		

	}

}
