package regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprs1 {

	public static void main(String[] args) {
		Pattern p= Pattern.compile("[abcd]");
		Matcher m=p.matcher("ab#12c@d");
		while(m.find()) {
			System.out.println(m.group()+"...."+m.start());
		}
	}

}
