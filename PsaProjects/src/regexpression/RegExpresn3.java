package regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpresn3 {
	public static void main(String[] args) {
		Pattern p1,p2,p3,p4,p5,p6;
		p1=Pattern.compile("\\s");  //for whitespaces
		p2=Pattern.compile("\\S");	//except white spaces
		p3=Pattern.compile("\\d");  //for digits
		p4=Pattern.compile("\\D"); //except digits
		p5=Pattern.compile("\\w");	//words+ digits
		p6=Pattern.compile("\\W"); //whitespaces
		Matcher m=p6.matcher("a34b cDF dER");
		System.out.println("ch..idx");
		while(m.find()) {
			System.out.println(m.group()+"..."+m.start());
		}
	}                        

}
