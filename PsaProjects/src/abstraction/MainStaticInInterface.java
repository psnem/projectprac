package abstraction;

public interface MainStaticInInterface {
	public static void test()
	{
		System.out.println("A static method should be defined in interface");
	}
	public static void main(String[] args) {
		System.out.println("We can define main method in interfae");
		MainStaticInInterface.test();
	}

}
