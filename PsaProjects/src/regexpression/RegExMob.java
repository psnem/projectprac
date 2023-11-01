package regexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMob {
	public static void main(String[] args) {
		System.out.println("Enter you mob no");
		/*sir logic
		 * 
		 * long mobno=sc.nextLong();
		 * String str=mobno.toString();
		 * 
		 * */
		Scanner sc=new Scanner(System.in);
		String mobno=sc.next();
		Pattern p=Pattern.compile("[^0-9]{10}");
		Matcher m=p.matcher(mobno);
		int count=0;
		while(m.find()) {
			System.out.println(m.group());
			count++;
		}
		System.out.println(count);
		if(count>0 || mobno.length()!=10)
			System.out.println("Error");
		else if(count==0 && mobno.length()==10)
			System.out.println("Accepted");
		
	}

}
