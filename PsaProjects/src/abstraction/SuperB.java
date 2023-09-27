package abstraction;

public class SuperB extends SuperA {
	SuperB(){
		//automatically placing super() keyword
		this(10); 
		willSee();
		
		
	}
	SuperB(int x){
// automatically placing super
		System.out.println(x);
	}

		public static void main(String[] args) {
		new SuperB();
	}
}
