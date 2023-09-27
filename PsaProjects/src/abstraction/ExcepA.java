package abstraction;

public class ExcepA {
	public static void main(String[] args) {
		try {
			int x=10;
			int y=0;
			int z=x/y;
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception is handled");
		
	}

}
