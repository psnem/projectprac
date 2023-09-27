package abstraction;

public class SuperC extends SuperA {
	public void test()
	{
		System.out.println("this is test of class C");
		super.willSee();
	}
	public static void main(String[] args) {
		SuperC sc=new SuperC();
		sc.test();
	}
}
