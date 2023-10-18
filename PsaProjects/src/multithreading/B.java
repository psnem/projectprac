package multithreading;

public class B implements Runnable {
	public void run() {
		System.out.println("with the help of runnable");
	}
	public static void main(String[] args) {
		B b=new B();
		Thread t=new Thread(b);
		t.start();
	}
}
