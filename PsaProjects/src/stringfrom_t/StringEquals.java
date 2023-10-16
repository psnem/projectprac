package stringfrom_t;

public class StringEquals {

	public static void main(String[] args) {
		String s1="Piyush";
		String s2="Piyush";
		System.out.println(s1==s2);// true
		
		String s3= new String("Piyush");
		System.out.println(s1==s3); 		//false
		System.out.println(s1.equals(s3));	//true
		
		String s4= new String("Piyush");
		System.out.println(s3==s4);			//false
		System.out.println(s3.equals(s4)); 	//true
		
		String st="ABC";
//		String st="DEF";
//		String st="GHI";

	}

}
