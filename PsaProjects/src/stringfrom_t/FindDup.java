package stringfrom_t;

import java.util.Iterator;

public class FindDup {
	public static int[] sort(int[] a) {
		for (int j = 0; j < a.length-1; j++) {
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		return a;
	
	}
	public static void removeDup(int[] a) {
		int c[]=new int[a.length];
		int id=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				c[id]=a[i];
				id++;
			}
		}
		
		for (int i = 0; i < id; i++) {
			System.out.println(c[i]);
		}
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,5,4,1,2,2,3,5};
		int[] b=sort(a);

		removeDup(b);	

	}

}
