package stringfrom_t;

public class StringBufferEgs {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Hello ");

		
		sb.insert(6,"Piyush,");
		System.out.println(sb);

		sb.append("This is Java");
		System.out.println(sb);
		
		sb.replace(1, 5, "olla");
		System.out.println(sb);
		
		sb.delete(2, 4);
		System.out.println(sb);
		

		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		
		System.out.println(sb.capacity());
	}

}
