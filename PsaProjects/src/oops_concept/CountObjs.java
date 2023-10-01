package oops_concept;

public class CountObjs {
	static int count=0;
	public CountObjs() {
		count++;
	}
	public static void main(String[] args) {

		new CountObjs();
		System.out.println(count);
	}
}
