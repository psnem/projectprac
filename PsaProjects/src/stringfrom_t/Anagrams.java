package stringfrom_t;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		System.out.println("Enter the 1st String");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int count=0;
		System.out.println("Enter the 2nd String");
		String str2 = sc.nextLine();
		if(str1.equals(str2)==true)
			System.out.println("Strings are anagrams");
		else if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str1.length();j++) {
					if(str1.charAt(i)==str2.charAt(j))
						count++;
				}
			}
			if(count==str1.length()) {
				System.out.println("Strings are anagrams");}

			else
				System.out.println("Strings are not anagrams");
			
		}
		else
			System.out.println("Strings are not anagrams");
		
	

	}

}
