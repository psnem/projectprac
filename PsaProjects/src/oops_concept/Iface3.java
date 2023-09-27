package oops_concept;

public interface Iface3 {
	public void print();
	default void show() {System.out.println("here we can define a method in interface");}
}
