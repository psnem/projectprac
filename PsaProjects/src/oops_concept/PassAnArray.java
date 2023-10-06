package oops_concept;

public class PassAnArray {
	PassAnArray(int[] ar){
		for(int val:ar)
			System.out.println(val);
		
	}

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,9};
		new PassAnArray(ar);

	}

}
