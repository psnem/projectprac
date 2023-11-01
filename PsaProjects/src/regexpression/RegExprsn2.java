package regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprsn2 {
	public static void main(String[] args) {
		Pattern p,p1,p2,p3,p4,p5,p6,p7,p8;
		p=Pattern.compile("[abcd]");
		p1=Pattern.compile("[a-z]");
		p2=Pattern.compile("[A-Z]");
		p3=Pattern.compile("[0-9]");
		p4=Pattern.compile("[A-Za-z]");
		p5=Pattern.compile("[0-9]{4}");
		//a12 Db23J@cL5#d
		Matcher m=p5.matcher("123456789");
		System.out.println("ch...idx");
		while(m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
	}
}
