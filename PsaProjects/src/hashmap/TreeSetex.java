package hashmap;

import java.util.TreeSet;

public class TreeSetex {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(30);		//only contains unique elements
		System.out.println(ts);
		

	}


}
