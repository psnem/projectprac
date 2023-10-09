package psarray;

import java.util.Scanner;

public class NPrimeNumb {
	static int count=0;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	for(int i=2;i<=100;i++)
	{	
		int flag=0;
		for(int j=2;j<=i;j++) {
			
			if(i%j==0)
				flag++;
		}
		if(flag==1) {
			System.out.println(i);
			count++;
		}
		if(count==num)
			break;
	}
}
}
