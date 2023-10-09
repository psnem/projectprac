package psarray;

public class RemovingDuplicate {
	static int j=0;
	public static int[] removeDuplicate(int[] ar) {
		int[] temp=new int[ar.length];
		
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				temp[j]=ar[i];
		
				j++;
			}
		}
		return temp;
		
	}
	public static int[] sort(int[] ar) {
		int temp=0;
		for(int i=0;i<ar.length-1;i++)	
		{
			for (int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
		}
	
	

	public static void main(String[] args) {
		int[] ar= {1,1,1,6,6,6,2,3,2,3,6,5,6,5,1};
		
		ar=sort(ar);
		ar=removeDuplicate(ar);
		for (int i = 0; i <j; i++) {
			System.out.println(ar[i]);
		}

	}

}
