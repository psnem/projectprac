package encapsulation;

import java.io.BufferedReader;
import java.io.FileReader;

public class HidePass {

	public static void main(String[] args) {
		StuData sd=new StuData();
		try {

			FileReader f=new FileReader("D://FileConcept//secret.txt");
			BufferedReader br=new BufferedReader(f);
			sd.setPass(br.readLine());
			System.out.println(sd.getPass());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
