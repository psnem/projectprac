package regexpression;

public class RegExMob2 {

	public static void main(String[] args) {
		String mobno="9718304170";
		String regex="[0-9]{10}";
		if(mobno.matches(regex))
			System.out.println("Valid");
		else
			System.out.println("invalid");
	}

}
