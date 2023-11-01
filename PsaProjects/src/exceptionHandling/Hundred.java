package exceptionHandling;

public class Hundred {

	public static void main(String[] args) {
			try {
				int i=10/0;
				
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
	// only way to stop finally block
	//			System.exit(0);
				System.out.println("100%");
			}
	}

}
