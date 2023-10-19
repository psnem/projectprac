package multithreading;

public class PushOfStack extends Thread{
	public static int top=0;
	synchronized public void run() {
		//System.out.println("PUSH: Top of the Stack "+top);
		while(top<=9) {
			System.out.println("PUSH: Top of the Stack "+top);
			
			top++;
			
			if(top==10) {
				try {
					
					sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
