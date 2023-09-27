package p1;

public class ChildClass extends BaseClass {

	public void test()
	{
		System.out.println("This is test of child class");
	}
	
	
	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		cc.test();
		cc.test2();
		ChildClass.test3();
		BaseClass bc= new BaseClass();
		bc.test();
		
	}
}
