package exceptionHandling;

public class MultipleExceptionClass {
	int n=100;
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
			MultipleExceptionClass mec=null;
			System.out.println(mec.n);
			}
			catch(NullPointerException|ArithmeticException e) 
			{e.printStackTrace();}
	}
}
