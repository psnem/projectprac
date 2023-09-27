package p2;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee(int id,String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+address.state+address.country);
		
	}
	
	public static void main(String[] args) {
		
		Address add1=new Address("Varanasi","UP","India");
		Address add2=new Address("Patna","Bihar","India");
		Employee emp1=new Employee(1,"Piyush",add1);
		Employee emp2=new Employee(2,"Durgesh",add2);
	}
}
