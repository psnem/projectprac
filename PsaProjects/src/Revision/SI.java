package Revision;

public class SI {
	public SI(int p,int r, int t)
	{
		int si=(p*r*t)/100;
		System.out.println("Simple interest is " +si);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				SI s=new SI(1000,10,5);
				SI s2=new SI(1000,15,4);
				SI s3=new SI(2000,10,5);
	}

}
