package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class RevisionPage 
{

	public static void main(String[] args) 
	{
		
		int a[]= {11,55,2,5,13,65,16};
		for(int i=0;i<a.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[smallest]>a[j])
					smallest=j;
			}
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
		}
		
		
		for(int val:a)
			System.out.print(" "+val);
	}

}
