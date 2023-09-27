package p1;

public class PlatinumAccount extends GoldAccount{
	@Override
	public void rateOfInterest()
	{
		System.out.println("6% PA");
	}
	
	
	public static void main(String[] args) {
		PlatinumAccount pa=new PlatinumAccount();
		pa.rateOfInterest();
		pa.onlineBanking();
				
	}
}
