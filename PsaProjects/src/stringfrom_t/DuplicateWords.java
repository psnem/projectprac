package stringfrom_t;

public class DuplicateWords {

	public static void main(String[] args) {
		String str="I love i when i code on i pad";
		str=str.toLowerCase();
		//System.out.println(str);
		String words[]=str.split(" ");
		System.out.println(words[2]);
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				
				if(i!=j) {
					if(words[i]==words[j]) {
						System.out.println("Why");
					}
				}
					
				
			}
		}

	}

}
