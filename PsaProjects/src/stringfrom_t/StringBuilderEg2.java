package stringfrom_t;

public class StringBuilderEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbd= new StringBuilder("Hello ");
		sbd.append("Java");
		System.out.println(sbd);
		sbd.insert(5, "StringBuilder");

		System.out.println(sbd);
		sbd.replace(11, 19, " ");

		System.out.println(sbd);
		sbd.delete(2, 4);

		System.out.println(sbd);
		sbd.reverse();
		System.out.println(sbd);
		
		System.out.println(sbd.capacity());
		
		
	}

}
