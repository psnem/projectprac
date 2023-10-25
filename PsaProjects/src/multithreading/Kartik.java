package multithreading;

public class Kartik extends Thread {
	public synchronized void run() {
		for (int i = 0; i <10; i++) {

			System.out.println("Kartik is calling.......");
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	public static void main(String[] args) {
		Kartik kar=new Kartik();
		Shubham shubh =new Shubham();

		kar.start();
		shubh.start();
		//one by one if we use join
		try {
			shubh.join();
			kar.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

