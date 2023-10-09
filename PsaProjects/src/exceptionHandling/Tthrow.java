package exceptionHandling;

public class Tthrow {
	
	static void method() throws Exception
	{
		throw new ArithmeticException("this is a setup");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Tthrow.method();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
