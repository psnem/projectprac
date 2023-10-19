package multithreading;

public class Producer extends Thread{
	public static int cart;
	@Override
	public void run() {
		while(cart<10) {
			cart++;
			System.out.println("Producer :"+cart);
		}
		
	}
}
