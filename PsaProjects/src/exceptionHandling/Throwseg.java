package exceptionHandling;

public class Throwseg {
	public static void main(String[] args) {
		Throwseg ce = new Throwseg();

		try {
			ce.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void test() throws Exception {
		System.out.println(10 / 0);

	}

}
