package abstraction;

public class AbstractB extends AbstractA {
	@Override
	public void test1()
	{
		System.out.println("this is test1");
	}
	public static void main(String[] args) {
		AbstractB ab=new AbstractB();
		System.out.println(ab.x);
		System.out.println(AbstractA.y);
		ab.test1();
		ab.test2();
		AbstractA.test3();
	}
}
