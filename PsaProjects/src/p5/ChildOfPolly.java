package p5;

public class ChildOfPolly extends Polly {
	@Override
	public void test(int y)
	{
		System.out.println("this is child  "+y);
		test2();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOfPolly cop=new ChildOfPolly();
		cop.test(100);
		
		Polly p=new Polly();
		p.test(200);

	}

}

