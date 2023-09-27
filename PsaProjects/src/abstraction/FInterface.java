package abstraction;
@FunctionalInterface
public interface FInterface {
	// there should be atleast one incomplete method
	public void test();
	// errro is gone
	//if we add one more incomplete method
	//public void test2();
	//error
	default public void test3()
	{
		System.out.println("this is default method test3");
	}
	default public void test4()
	{
		System.out.println("this is default method test4");
	}
}
