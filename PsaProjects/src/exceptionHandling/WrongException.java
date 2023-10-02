package exceptionHandling;

public class WrongException {
	public static void main(String[] args) {
		try {
			int x=25/0;
			System.out.println(x);
		}
		catch(NullPointerException e){
			System.out.println("it is wron exception so catch block will not be executed"+e);
		}
		finally {
			System.out.println("but finally always works");
		}
		System.out.println("rest of the code");
		
	}

}
