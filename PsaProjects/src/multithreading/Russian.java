package multithreading;

public class Russian extends Thread {
	@Override
	public void run()
	{
		for(int i=0;i<20;i++) {

			System.out.println("BigBillionDay");
			try {
				sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
