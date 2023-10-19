package association;

public class PrimeMinister {
	String pmName;
	Country countryName;
	PrimeMinister(String pmName,Country countryName){
		this.pmName=pmName;
		this.countryName=countryName;
	}
	public String getPMName(){
		return pmName;
	}
	public Country countryName() {
		return countryName;
	}
public static void main(String[] args) {
	Country cn=new Country("India");
	PrimeMinister pm=new PrimeMinister("Narendra Modi",cn);
	System.out.println(pm.getPMName());
	System.out.println(pm.countryName);
	System.out.println(cn.countryName);
}
}
