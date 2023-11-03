package dsa;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLbyPSA {

	public static void main(String[] args) {
		LinkedList<Integer> x=new LinkedList<Integer>();
		x.add(100);
		x.add(200);
		x.add(30);
		x.addFirst(10);	
		x.addLast(11);
		x.add(new Integer(40));
	
		System.out.println(x);
		
		x.add(4,50);
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
