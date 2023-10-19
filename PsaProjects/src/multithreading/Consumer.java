package multithreading;

public class Consumer extends Thread {
	@Override
	public void run() {
		while(Producer.cart>0) {
			System.out.println("This is consumer :"+Producer.cart);
			Producer.cart--;

			System.out.println("Consumed :"+Producer.cart);
		}

	}
	public static void main(String[] args) {
		Producer pro=new Producer();
		Consumer con=new Consumer();
		pro.start();
		con.start();
	}

}
