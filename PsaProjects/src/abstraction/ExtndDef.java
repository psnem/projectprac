package abstraction;

public class ExtndDef implements DefInterface{
	
	@Override
	public void test1() {
		System.out.println("this method is acquired");
	}

	public static void main(String[] args) {
		ExtndDef ed= new ExtndDef();
		ed.test();
		ed.test1();
		ed.test2();

	}

}
