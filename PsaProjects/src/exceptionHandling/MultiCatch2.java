package exceptionHandling;

public class MultiCatch2 {
	int n=10;
	public static void main(String[] args) {
		
		try {
			int i=0;
			int j=10/i;
			
			MultiCatch2 mc=null;
			System.out.println(mc.n);
			
			System.out.println(j);
			System.out.println("rest of the code in try block");
			
		}
		catch(ArithmeticException ae) {ae.printStackTrace();}
		catch(NumberFormatException nfe) {nfe.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		catch(Throwable t) {t.printStackTrace();} // it can not be written above because it is parent class
		
		System.out.println("rest of the code after catch");

	}

}
