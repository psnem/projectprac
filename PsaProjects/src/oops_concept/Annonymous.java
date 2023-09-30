package oops_concept;

public class Annonymous {
	public void fact(int n) {
		// TODO Auto-generated constructor stub
		int m=1;
		for(int i=n;i>=1;i--)
			m*=i;
		System.out.println(m);
	}
	public static void main(String[] args) {
		new Annonymous().fact(5);
	}

}
