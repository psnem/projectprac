package exceptionHandling;

public class NumberFormatExePSA {

	public static void main(String[] args) {
		try {
			String s="abc123";
			int i=Integer.parseInt(s);
			System.out.println(i);
			
			float f=Float.parseFloat(s);
			System.out.println(f);
			
			long l=Long.parseLong(s);
			System.out.println(l);
			
			double d=Double.parseDouble(s);
			System.out.println(d);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
