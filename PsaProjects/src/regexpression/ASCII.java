package regexpression;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {  
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		//capital letters 65to 90
//		for (int i = 65; i <150; i++) {			//small 97 to 122
			char c=(char)i;
			if(i>96 && i<123)
				System.out.println("small letter  "+c);
			else if (i>64 && i<91)
				System.out.println("Capital letter  "+c);
	//		System.out.println("value of "+i+"is "+c);
		}
	}


