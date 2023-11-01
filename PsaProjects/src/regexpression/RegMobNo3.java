package regexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMobNo3 {
	public static void main(String[] args) {
		try {
			System.out.println("Enter your mob no : ");
			Scanner sc=new Scanner(System.in);
			Long mobno=sc.nextLong();
			String mobNo=mobno.toString();
			int count=0;
			Pattern p=Pattern.compile("[6-9][0-9]{9}");
			Matcher m=p.matcher(mobNo);
			while(m.find()) {
				count++;
				//System.out.println(m.group());
			}
	
			System.out.println(count);
			if(count!=1|| mobNo.length()<10)
				System.out.println("Error");
			else if(mobNo.length()==10)
				System.out.println("Accepted");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Input");
			}
		
	}

}
