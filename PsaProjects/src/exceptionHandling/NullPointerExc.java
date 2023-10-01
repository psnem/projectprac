package exceptionHandling;

public class NullPointerExc {
	public static void main(String[] args) {
	try {
		int[] a=null;
		System.out.println(a.length);
	
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println(e);
	}
	System.out.println("this line works despite we have error above line");
	}

}
