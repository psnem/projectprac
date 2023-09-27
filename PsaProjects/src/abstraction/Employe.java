package abstraction;

public class Employe extends PersonDetail {
	
	float salary;
	Employe(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
	public void display() {
		System.out.println("ID "+id+"\nName "+name+"\nSalary "+salary);
	}
	public static void main(String[] args) {
		Employe emp= new Employe(1,"Piyush",51000.0f);
		emp.display();
	}
}
