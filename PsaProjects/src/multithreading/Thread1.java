package multithreading;

public class Thread1 extends Thread {
	public void run() {
		for(int i=0;i<10000;i++)
			System.out.println("run");
	}
	
	
	public static void main(String[] args) {
		for(int i=0;i<10000;i++)
			System.out.println("main");
		Thread1 t1=new Thread1();
		t1.start();

	}

}
