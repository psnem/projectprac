package multithreading;

public class Thrd3 implements Runnable {
		String name;
		Thrd3(String name){
			this.name=name;
		}
		@Override
		public void run() {
			for(int i=0;i<10000;i++)
				System.out.println(this.name);
		}
	public static void main(String[] args) {
		Thrd3 t1= new Thrd3("XXX");
		Thrd3 t2= new Thrd3("ABC");
		Thrd3 t3= new Thrd3("PQR");
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		Thread t33=new Thread(t3);
		t11.start();
		t22.start();
		t33.start();
		
		
		
	}

}
