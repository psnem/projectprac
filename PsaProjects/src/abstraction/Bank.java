package abstraction;

abstract public class Bank {
	abstract int rate();
	
	
	public static void main(String[] args) {
		Bank b;
		b=new PNB();
		System.out.println(b.rate());
		b=new SBI();
		System.out.println(b.rate());
	}
}
