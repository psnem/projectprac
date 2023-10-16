package stringfrom_t;

public class CountAB {

	public static void main(String[] args) {
		String st="abbbabbaaab";
		int ca=0,cb=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a')
				ca++;
			else if(st.charAt(i)=='b')
				cb++;
		}
		System.out.println("Number of a :"+ca);

		System.out.println("Number of b :"+cb);

	}

}
