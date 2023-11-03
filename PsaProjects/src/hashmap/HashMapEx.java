package hashmap;

import java.util.HashMap;
//import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(100,"Piyush");
		hm.put(101,"Neel");
		hm.put(102,"Nikhil");
		System.out.println(hm);
		System.out.println(hm.get(101)); // access by key
		System.out.println("All values :"+hm.values()); //all the values
		System.out.println("All keys :"+hm.keySet()); //all the keys
	}
}
