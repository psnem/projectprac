package multithreading;

public class ThreadPriorityEx extends Thread{
		String name;
		public ThreadPriorityEx(String name) {
			this.name=name;
		}
		public void run() {
			System.out.println(this.name);
		}
	public static void main(String[] args) {
		ThreadPriorityEx tp1=new ThreadPriorityEx("Piyush");
		ThreadPriorityEx tp2=new ThreadPriorityEx("Pankaj");
		tp1.setPriority(MAX_PRIORITY);
		tp2.setPriority(MIN_PRIORITY);
		tp1.start();
		tp2.start();
		System.out.println(tp1.getPriority());
		System.out.println(tp2.getPriority());
	}

}
