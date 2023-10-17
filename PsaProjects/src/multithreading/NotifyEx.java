package multithreading;

public class NotifyEx extends Thread {
	int total=0;
	public synchronized void run() {
		for (int i = 0; i < 1000; i++) {
			total+=i;
		}
		notify();
	}

	public static void main(String[] args) {
		NotifyEx ne=new NotifyEx();
		ne.start();
		synchronized (ne) {
			try {
				ne.wait(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ne.total);
		}

	}

}
