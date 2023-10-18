package multithreading;

public class ThreadPrac extends Thread {
	public static ThreadPrac tp;
	public static Thread t1;
	public void run(){
		System.out.println("This is just for practice");
		t1.start();
	//	System.out.println(t1.getState());
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		System.out.println("After sleep");
		System.out.println(t1.getState());
	}
	public static void main(String[] args) {
		ThreadPrac tp=	new ThreadPrac();
		Thread t1= new Thread(tp);
		t1.start();
		
	}
}
