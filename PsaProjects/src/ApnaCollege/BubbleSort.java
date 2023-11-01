package ApnaCollege;

public class BubbleSort {

	public static void main(String[] args) {
		//Bubble sort //n^2
		int temp;
		int A[]= {12,56,25,45,85,7,56};
		int len=A.length;
		for(int i=0;i<A.length-1;i++) // here we take length -1 so j+1 would not be the cause of overflow
		{
			for(int j=0;j<A.length-i-1;j++)	
			{
				if(A[j]>A[j+1])
				{
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				
			}
		
		}
		
		for(int value:A)
			System.out.print(" "+value);
		System.out.println("\nHighest  :"+A[len-3]);
	}

}
