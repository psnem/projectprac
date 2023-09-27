package abstraction;

public class StudyFunctionalInterface implements FInterface {
@Override
public void test()
{
	System.out.println("this test is acquired");
}
public static void main(String[] args) {
	StudyFunctionalInterface sfi=new StudyFunctionalInterface();
	sfi.test();
}
}
