package multithreading;

public class ThreadLyfCycle extends Thread {

	public static void main(String[] args) {
		ThreadLyfCycle tlc= new ThreadLyfCycle();
		System.out.println(tlc.getState());
		tlc.start();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(tlc.getState());
		
	}
	public void run() {
		System.out.println("Test");
	}

}
