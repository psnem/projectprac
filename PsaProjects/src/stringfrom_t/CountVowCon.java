package stringfrom_t;

import java.util.Scanner;

public class CountVowCon {
	public static void countVowCon(String str) {
		String lowchar=str.toLowerCase();
		int vow=0;
		int con = 0;
		for(int i=0;i<lowchar.length();i++) {;
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vow++;
			}
			else if(c==' ')
				continue;
			else
				con++;
		}
		System.out.println("No of vowel : "+vow);

		System.out.println("No of consonant : "+con);
	} 

	public static void main(String[] args) {
		System.out.println("Enter the message");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countVowCon(str);


	}

}
