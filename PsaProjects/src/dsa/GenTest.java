package dsa;

public class GenTest {
	public static void main(String[] args) {
		GenericsEx g=new GenericsEx("Piyush");

		GenericsEx<Integer> g1=new GenericsEx<>(007);
		GenericsEx<Character> g2=new GenericsEx<>('P');
		GenericsEx<Boolean> g3=new GenericsEx(true);
//		System.out.println(g.val);
//		System.out.println(g1);
//		System.out.println(g2);
//		System.out.println(g3);
		
		
	}

}
