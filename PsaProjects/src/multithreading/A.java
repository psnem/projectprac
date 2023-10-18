package multithreading;

public class A extends Thread{
	public void run() {
		for(int i=0;i<100;i++)
			System.out.println(i);

		System.out.println("THis is working..........");
	
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.start();
	}

}
