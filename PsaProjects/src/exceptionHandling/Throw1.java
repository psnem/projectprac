package exceptionHandling;

public class Throw1 {
	// throw use for custome exception
	public void validate(int x) {
		try {
			if(x<18) 
			{	

				System.out.println("you should be greater than 18");
				throw new ArithmeticException("he can not vote");
			}
			else
				System.out.println("He can");
			
			}
		finally {}
	}

	public static void main(String[] args) {
	
		Throw1 th=new Throw1();
		th.validate(8);
		System.out.println("Rest of the code");
	
	}

}
