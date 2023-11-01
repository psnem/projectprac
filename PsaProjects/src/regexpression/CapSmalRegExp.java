package regexpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapSmalRegExp {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]");//small letters
		Pattern p1 = Pattern.compile("[A-Z]");//for capital letters
		Pattern p2 = Pattern.compile("\\W");  //for special charecter
		Pattern p3 = Pattern.compile("\\d");  //for digits
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Matcher m = p.matcher(str);
		System.out.print("Small Letters:  ");
		while (m.find()) {
			System.out.print(m.group());
		}
		System.out.println();
		System.out.print("Capital letters:  ");
		Matcher m1 = p1.matcher(str);
		while (m1.find()) {
			System.out.print(m1.group());
		}
		System.out.println();
		System.out.print("Special Character:  ");
		Matcher m2 = p2.matcher(str);
		while (m2.find()) {
			System.out.print(m2.group());
		}
		System.out.println();
		System.out.print("Numbers:  ");
		Matcher m3 = p3.matcher(str);
		while (m3.find()) {
			System.out.print(m3.group());
		}
	}
}
