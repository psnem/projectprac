package stringfrom_t;

public class Str1 {

	public static void main(String[] args) {
		char ch[]= {'a','v','a','i','l','a','b','l','e'};
		String s=new String(ch);
		System.out.println(s);
		System.out.println(s.concat(" tonight?"));
		System.out.println(s);
		// string s is still same, immutable
		//but
		s=s.concat(" now?");
		System.out.println(s);
		
		String s2="available now?";
		System.out.println(s2);
		System.out.println(s2.equals(s));
		
		String s3="Piyush";
		String s4="PIYUSH";
		System.out.println(s3.equals(s4));

		System.out.println(s3.equalsIgnoreCase(s4));
		
		String name="Raj", name2="Raj";
		System.out.println(name==name2);
		//instance is same 
		String name3=new String("Raj");
		System.out.println(name==name3);
		//name3 is new in nonpool
		String a1="abcd",a2="abcd",a3="bcd";
		System.out.println(a1.compareTo(a2));//0
		System.out.println(a1.compareTo(a3));//a3-a1=-1
		System.out.println(a3.compareTo(a2));// a2-a3=1
		
		
		
		
		
		
		
	}

}
