package mfp;
import java.util.*;
public class dowhilepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new  Scanner(System.in);
		int n= sc.nextInt();
		int i=1,f=1;
		do
		{
			f=f*i;
			i++;
		}while( i<=n);
		System.out.println("Factorial of your number is" + f);
		
	}

}
