package regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringWithGaps {
	public static void main(String[] args) {
		//Pattern p=Pattern.compile("a+");
		Pattern p=Pattern.compile("a?");  //each character with space will come 
		Matcher m=p.matcher("aabaaababaaaab");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
	}

}
