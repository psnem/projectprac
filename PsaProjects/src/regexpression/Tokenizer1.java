package regexpression;

import java.util.StringTokenizer;

public class Tokenizer1 {

	public static void main(String[] args) {
		int count=0;
		StringTokenizer str=new StringTokenizer("Pankaj Sir academy");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}
		System.out.println(count);
	}

}
