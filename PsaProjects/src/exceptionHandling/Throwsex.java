package exceptionHandling;

public class Throwsex {
	void div(int x,int y)throws Exception
	{
		System.out.println(x/y);
	}

	public static void main(String[] args) {
		
		Throwsex te=new Throwsex();
		try {
		te.div(12,0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
