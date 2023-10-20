package stringfrom_t;

import java.util.Scanner;

public class AllSubString2 {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int temp=0;
		int len=str.length();
		String sstr[]=new String[len*(len+1)/2];
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				sstr[temp]=str.substring(i,j+1);
				temp++;
			}
		}

		for(String s:sstr)
			System.out.println(s);
		

	}

}
