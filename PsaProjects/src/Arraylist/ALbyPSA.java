package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ALbyPSA {

	public static void main(String[] args) {
		ArrayList x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(new Integer(40));
		
		System.out.println(x);
		
		ArrayList<Integer> y=new ArrayList<Integer>();
		y.add(60);
		y.add(70);
		y.add(80);
		
		x.addAll(y);
		System.out.println(x);
		x.add(4, 50);
		System.out.println("After adding 50 at 5th position"+x);
		
		if(x.contains(50))
			System.out.println("Present");
		else
			System.out.println("Abset");
		x.remove(3);
		System.out.println(x);
		
		System.out.println("3rd elecement  :"+x.get(2));
		Iterator itr=x.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" , ");

	}

}
