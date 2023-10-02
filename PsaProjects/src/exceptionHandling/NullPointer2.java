package exceptionHandling;

public class NullPointer2 {
	static NullPointer2 np2;// null reference variable trying to access non static variable
	int x=10;
public static void main(String[] args) {
	try {
		System.out.println(np2.x);
	}
	catch(Exception e)
	{
		System.out.println(e);
		e.getStackTrace();
	}

}}
