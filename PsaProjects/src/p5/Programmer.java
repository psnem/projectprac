package p5;

public class Programmer extends Employee {
	float bonus=10000 ;
	
	
	public static void main(String[] args) {
		Programmer pr=new Programmer();
		System.out.println("Salry is "+pr.salary);

		System.out.println("Bonus is "+pr.bonus);
	}

}
