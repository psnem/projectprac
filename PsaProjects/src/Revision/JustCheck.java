package Revision;

public class JustCheck {

public static void main(String[] args) {
		
		
		int temp;
		int A[]= {3,2,1,5,7,9,4,3,6};
		int size=A.length;
		for(int i=0;i<A.length-1;i++)
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

		
		int x=A[size-1]+A[size-2];
		int y=A[0]+A[1];
		
		System.out.println("MaxPairSum "+x);
		System.out.println("MinPairSum "+y);
		System.out.println("MaxPairProduct "+A[size-1]*A[size-2]);
		System.out.println("MinPairProduct "+A[0]*A[1]);
		
		

	}
}
