package oops_concept;

public class FormultipleInheritence implements Iface1 ,Iface2,Iface3 {
	
	
	
	public static void main(String[] args) {
	FormultipleInheritence mul=new FormultipleInheritence();
	mul.print();
	mul.show();
	Iface2.classFriend();
	}

	@Override
	public void print() {
		System.out.println("as there is only one defination of the multiple \nmethods in multiple interfaces \n there will be no ambiguity");
		
	}

}
