package exceptionHandling;

public class ArrIndexOutOfBound {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			System.out.println(arr[8]);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("this message shows despite exception");
	}

}
