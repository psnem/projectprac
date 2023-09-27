package abstraction;


public class LamdaClass {
	public static void main(String[] args) {
		LamdaInterface lc=()->{
			System.out.println("Lambda function is used here");
		};
		lc.test();
	}
}
