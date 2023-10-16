package stringfrom_t;

final public class ImmutableClass {
	private final int age;
	private final String name;
	public ImmutableClass(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
			ImmutableClass ic=new ImmutableClass(1, "Piyush");
			System.out.println(ic.getName());
			System.out.println(ic.getAge());
	

	}

}
