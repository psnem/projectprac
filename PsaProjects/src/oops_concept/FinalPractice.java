package oops_concept;

public class FinalPractice extends Uninheritable { //final class can not be inheritted 
	final static int z; // initialization is mandatory
	final int a;

	public static void main(String[] args) {
		final int x=10; //i can not alter the value of x
		int y=10;
		x++;
		x=y;
		
		System.out.println(x);
		
	}
}