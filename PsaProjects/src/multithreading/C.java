package multithreading;

public class C extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				System.out.println("I am sleeping..."+i);
			
				Thread.sleep(2000);
				System.out.println("I am awake..."+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		C c1=new C();
		C c2=new C();
		c1.start();
		c2.start();
		try {
			c1.join();
			c2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
