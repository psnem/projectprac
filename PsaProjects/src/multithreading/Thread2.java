package multithreading;

public class Thread2 extends Thread{
	String name;
	Thread2(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
			System.out.println(this.name);
	}
	public static void main(String[] args) {
		Thread2 t2=new Thread2("Piyush");
		Thread2 t3=new Thread2("Shubham");
		Thread2 t4=new Thread2("Kartik");
		t2.start();
		t3.start(); 
		t4.start();
	}
}
