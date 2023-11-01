package exceptionHandling;

public class Thrwosegg {
	public static void main(String[] args) throws Exception {
		Thrwosegg th = new Thrwosegg();
		th.test();

	}
	private void test() throws Exception {
		System.out.println(10 / 0);
	}
}
