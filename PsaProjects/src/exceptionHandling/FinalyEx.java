package exceptionHandling;

public class FinalyEx {
	
public static void main(String[] args) {
	try {
		int x=25/5;
		System.out.println(x);
	}
	catch(Exception e){
		e.getStackTrace();
		
	}
	finally{
		System.out.println("Whether exception occurs or not, finally executes");
	}
	System.out.println("rest of the code");
}	


}
