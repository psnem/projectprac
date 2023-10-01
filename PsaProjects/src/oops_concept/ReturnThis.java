package oops_concept;

public class ReturnThis {
	ReturnThis getMessage() {
		return this;
	}
	public void msg() {
		System.out.println("Hi this is made by Piyush");
	}
	public static void main(String[] args) {
		new ReturnThis().getMessage().msg();
	}
}
