package association;

public class Employe {
	String name;
	int eid;
	Address add;
	public Employe(String name,int eid, Address add){
		this.name=name;
		this.eid=eid;
		this.add=add;
	}
	public void getDetail() {
		System.out.println(this.name);
		System.out.println(this.eid);
		System.out.println(add.city);
		System.out.println(add.state);
	}
	
	public static void main(String[] args) {
		Address ad=new Address("New Delhi","Delhi");
		Employe emp=new Employe("Piyush",1,ad);
		emp.getDetail();
		
	}
}
