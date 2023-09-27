package oops_concept;

public class NewCustomer implements SavingAccount {

	@Override
	public void adharCard() {
		// TODO Auto-generated method stub
		System.out.println("Done");
		
	}

	@Override
	public void thumbImpression() {
		// TODO Auto-generated method stub
		System.out.println("done");
		
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("done");
	}
	public static void main(String[] args) {
		NewCustomer nc=new NewCustomer();
		nc.adharCard();
		nc.thumbImpression();
		nc.photo();
	}

}
