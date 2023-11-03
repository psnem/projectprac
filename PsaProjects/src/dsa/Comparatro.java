package dsa;

import java.util.Comparator;

public class Comparatro implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}
	

	public static void main(String[] args) {
		Comparatro com=new Comparatro();
		int val=com.compare(new Student(101,"Pankaja"),	new Student(102,"Shivam"));
		System.out.println(val);
	}

	

}
