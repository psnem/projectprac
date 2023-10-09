package encapsulation;

public class ReadOnlyEn {
	private String name;
	String getter(String s) {
		name=s;
		return name;
	}

	public static void main(String[] args) {
		
		ReadOnlyEn ro=new ReadOnlyEn();
		ro.getter("Piyush");
		System.out.println(ro.name);
	}

}
