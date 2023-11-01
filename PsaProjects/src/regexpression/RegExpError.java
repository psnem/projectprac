package regexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpError {
	public static void main(String[] args) {
		System.out.println("Enter your name : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		Pattern p=Pattern.compile("[^A-Za-z]");  // s for spaces, W for special characters
		Matcher m=p.matcher(name);
		int count=0;
		while(m.find()) {
			count++;
		}
		//System.out.println(count);
		if(count>0 || name.length()<4)
			System.out.println("Error");
		else
			System.out.println("Accepted");
	}

}
