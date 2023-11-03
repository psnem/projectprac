package Arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class StuLL {
	public static void main(String[] args) {
		StudentInfo Arun=new StudentInfo("Arun",1);
		StudentInfo Binod=new StudentInfo("Binod",2);
		StudentInfo Chandan=new StudentInfo("Chandan",3);
		StudentInfo Dinesh=new StudentInfo("Dinesh",4);
		LinkedList<StudentInfo> si=new LinkedList<StudentInfo>();
		si.add(Arun);
		si.add(Binod);
		si.add(Chandan);
		si.add(Dinesh);
		
		
		Chandan.setId(11);
		System.out.println(Chandan.getId());

		
		for(StudentInfo s:si)
		{
			System.out.println(s.getName());
		}
	}

}
