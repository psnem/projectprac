package p1;

public class B2 extends A {
	
	public void test()
	{
		System.out.println(200);
		
	}
	
	public static void main(String[] args) {
//		A a2=new A();
//		System.out.println(a2.x);
//		a2.test();
		A aa= new B2();
		aa.test();
	}
}
