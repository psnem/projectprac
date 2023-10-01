package oops_concept;

public class CopyConstructor {
	String name;
	int id;
	public CopyConstructor(String n,int i) {
		// TODO Auto-generated constructor stub
		name=n;
		id=i;

		System.out.println("Name is "+name+"id is "+id);
	}
	public CopyConstructor(CopyConstructor cc1) {
		name=cc1.name;
		id=cc1.id;
		System.out.println("Name is "+name+"id is "+id);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		CopyConstructor cc1=new CopyConstructor("Piyush",1);
		new CopyConstructor(cc1);
	}

}
