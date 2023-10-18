package Revision;




public class RevPage implements Runnable{
	public static RevPage rp;
	public static Thread th;
	public static void main(String[] args) {
		rp=new RevPage();
		th=new Thread(rp);
		System.out.println(th.getState());
		th.start();
		System.out.println(th.getState());
		
	}
	public void run() {
		RevisionPage rp1=new RevisionPage();
		Thread th1=new Thread(rp1);
		System.out.println(th1.getState());
		th1.start();

		System.out.println(th1.getState());
		try {
			th1.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(th1.getState());
		try {
			th1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(th1.getState());
		
	}
}