package stringfrom_t;

import java.util.Scanner;

public class AllSubString {
	public static void allSubString(String sb) {
		//StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<=sb.length();i++) {
			
			for(int j=i+1;j<=sb.length();j++) {
				System.out.println(sb.substring(i,j));
				StringBuilder sb2=new StringBuilder(sb.subSequence(i, j));
				if(sb2.length()==1)
					continue;
				else
					System.out.println(sb2.reverse());
			}
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the message");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		allSubString(str);
	

	}

}
