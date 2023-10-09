package encapsulation;

import java.util.Scanner;

public class Encap1 {
	private String name;
	void setData(String name)
	{
		this.name=name;
		
		
	}
	String getData()
	{
		return name;
	}
	public static void main(String[] args) {
		Encap1 e1=new Encap1();
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);

		e1.setData(sc.next());
		System.out.println(e1.getData());
	}

}
