package oops_concept;

public class ThisEg {
	ThisEg(){
		System.out.println(this);
	}
	ThisEg te() {
		
		return this;
	}
	
	
	
	public static void main(String[] args) {
		ThisEg te1=new ThisEg();
		System.out.println(te1);
		
		System.out.println(new ThisEg().te());
	}

}
