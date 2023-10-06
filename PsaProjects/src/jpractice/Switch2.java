package jpractice;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class Switch2 {

	public static void main(String[] args) {
		
		System.out.println("What do you want: F Fruit ,V vegetable,G groceries");
		Scanner sc=new Scanner(System.in);
		String key=sc.next();
		switch(key) {
		
		case "F":
			System.out.println("C cake, S salad, J juice");
			String key2=sc.next();
			switch(key2) {
				case "C":
					System.out.println("Here is your cake,200Rs");
					break;
				case "S":
					System.out.println("Here is your Salad,50Rs");
					break;
				case "J":
					System.out.println("Here is your juice,100Rs");
					break;
				default :
					System.out.println("Thank you for visiting");
					break;
					}
				break;
		case "V":
			System.out.println("Vegetable juice or salad");
			String key3=sc.next();
			switch(key3) {
			case "J":
				System.out.println("Here is your juice, 75Rs");
				break;
			case "S":
				System.out.println("Here is your Salad,50");
				break;
			default :
				System.out.println("Thank you for visiting");
				break;
			}
			break;
		case "G":
			System.out.println("Here is your groceries, 100Rs");
			break;
		default:
			System.out.println("thank you for visiting");
			
		}
		

	}

}
