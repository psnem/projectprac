package abstraction;
@FunctionalInterface
public interface DefInterface {
	default public void test()
	{
		System.out.println("Default methods should be defined in an interface");
	}
	public void test1();
	
	default public void test2()
	{
		System.out.println("This is test2");
	}
}
