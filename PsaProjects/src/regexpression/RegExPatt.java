package regexpression;

import java.util.regex.*;

public class RegExPatt {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a*");
		Matcher m=p.matcher("aabaaababaaaab");
		while(m.find())
			System.out.println(m.start()+"..."+m.group());
		
	}
}
