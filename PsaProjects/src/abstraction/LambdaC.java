package abstraction;

public class LambdaC {
	public static void main(String[] args) {
		LambdaA la=(int x,int y)->{
			System.out.println(x+y);
		};
		
		LambdaB lb=(int x,int y)->{
			System.out.println(x*y);
		};
		la.add(10,20);
		lb.mul(20, 30);
	}
}
