package abstraction;

//here we avoid functional interface so we can have multiple inheritance

public interface LambdaD extends LambdaA, LambdaB {
	
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
