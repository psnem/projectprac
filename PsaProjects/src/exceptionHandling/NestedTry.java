package exceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		try {
			try {
				int x=10/0;
				System.out.println(x);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				int[] a=new int[5];
				System.out.println(a[5]);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			System.out.println("outer catch");
		}
		System.out.println("rest of the code");
	}

}
