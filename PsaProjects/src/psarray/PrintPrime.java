package psarray;

public class PrintPrime {

	public static void main(String[] args) {
		for(int i=2;i<=20;i++)
		{	
			int f=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0)
				{
					f++;
				}
			}
			if(f==1)
				System.out.println(i);
		}
}
}
