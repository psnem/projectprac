package p1;

public class B extends A {
	public void test()
	{
		System.out.println(100);
	}
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.x);
		b.test();
	}
}
