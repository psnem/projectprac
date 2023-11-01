package regexpression;

import java.util.StringTokenizer;

public class Tokenizer2 {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("12-12-2020","-");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
