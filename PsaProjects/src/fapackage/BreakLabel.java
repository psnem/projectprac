package fapackage;

public class BreakLabel {

	public static void main(String[] args) {
			
	p:	for (int i = 0; i < 4; i++) {
			System.out.println("this is i");
			for (int j = 0; j < 4; j++) {
				System.out.println("this is j");
				for (int j2 = 0; j2<4; j2++) {
					System.out.println("this is j2");
					break p;
				}
			}
			
		}

	}

}
