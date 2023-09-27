package abstraction;

public class SuperA {
	public SuperA() {
	System.out.println("This is constructor of parent class");
	}
	public SuperA(int x) {
		System.out.println(x++);
		}
	public void willSee() {
		System.out.println("this is random method of Super class");
	}

}
