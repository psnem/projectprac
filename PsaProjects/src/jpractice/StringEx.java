package jpractice;

public class StringEx {

	public static void main(String[] args) {
		 String name="Piyush";
	     String lname="Sharma";
	     System.out.println(name+lname);
	     System.out.println(name.charAt(2));
	     System.out.println(name.length());
	     System.out.println(name.replace('i','e'));
	     System.out.println(lname.replace('a','A'));
	     String FullName=name+lname;
	     
	     System.out.println(FullName.substring(4,9));
	    
	}

}
