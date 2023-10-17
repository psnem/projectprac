package multithreading;

public class ThreadNameEx extends Thread {
	String name;
	public ThreadNameEx(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(this.name);
		
	}
	public static void main(String[] args) {
		ThreadNameEx tn1=new ThreadNameEx("First Thread");
		ThreadNameEx tn2=new ThreadNameEx("Second  Thread");
		tn1.start();
		tn2.start();
		tn1.setName("Piyush");
		tn2.setName("Pankaj");
		

	}

}
