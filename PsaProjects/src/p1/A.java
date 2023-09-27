package p1;

public class A {
	 int x=10;
	 void  test () {
		System.out.println("This is test");
	}
	 void test(int x)
	 {
		 System.out.println(x*x);
	 }

	 void test(int x, int y)
	 {
		 System.out.println(x*y);
	 }
	 
	
	public static void main(String[] args) {
		A aa=new A();
		aa.test(2);
		aa.test(7,2);
		System.out.println(aa.x);
	}

}
