package stringfrom_t;

import java.util.Scanner;

public class CharMethods {

	public static void main(String[] args) {
		Character ch=new Character('a');
		if(Character.isAlphabetic(ch)==true) {
			System.out.println("Charecter is alphabet");
			if(Character.isUpperCase(ch)==true)
				System.out.println("this is in upper case");
			else
				System.out.println("this is in lower case");
			ch=Character.toLowerCase(ch);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				System.out.println("character is vowel");
			else
				System.out.println("it is consonant");
		}
		else if(Character.isDigit(ch))
			System.out.println("It is number");
		else
			System.out.println("it is special charecter");
		
	}

}
