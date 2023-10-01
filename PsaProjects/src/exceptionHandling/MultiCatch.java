package exceptionHandling;

public class MultiCatch {
	public static void main(String[] args) {
		try
		{
			int[] a=new int[5];
			int b=a[5]=10/0;
			System.out.println(b);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
