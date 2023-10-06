package oops_concept;

public class ReturnAnArray {
	
	int[] returnar(int[] ar) {
		return ar;
	}

	public static void main(String[] args) {
		int[] arr= {12, 13, 15, 11, 45, 65};
		int[] rrr= {};
		ReturnAnArray ret= new ReturnAnArray();
		rrr=ret.returnar(arr);
		for(int val:rrr)
			System.out.println(val);

	}

}
