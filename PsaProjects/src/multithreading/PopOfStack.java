package multithreading;

public class PopOfStack extends Thread{
	synchronized public void run() {
		//System.out.println("POP: Top of the Stack "+PushOfStack.top);
		
		while(PushOfStack.top>=0) {
			System.out.println("POP: Top of the Stack "+PushOfStack.top);
			
			PushOfStack.top--;
			if(PushOfStack.top==0)
			{
				try {
					sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	public static void main(String[] args) {
		PopOfStack pop=new PopOfStack();
		PushOfStack push=new PushOfStack();

		push.start();
		pop.start();
//		try {
//			push.join();
//			pop.join();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
	}

}
