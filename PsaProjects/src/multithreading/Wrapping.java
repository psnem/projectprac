package multithreading;

public class Wrapping {

	public static void main(String[] args) {
		//Wrapping
		int a=20;
		Integer k=Integer.valueOf(a);
		Integer j=a; // compiler writes valuof automatically
		System.out.println(a+j+k);
		
		//Unwrapping
		Integer b=new Integer(3);
		int c=b.intValue();
		int d=b;
		System.out.println(b+c+d);
	}

}
