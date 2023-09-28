package exceptionHandling;

public class Number_formatexc {
public static void main(String[] args) {
	try {
		String s="abvv";
		int x=Integer.parseInt(s);

	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println("this line executed despite above exception");
}
}
