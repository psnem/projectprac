package encapsulation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class SetPassIntoFile {
	public static void main(String[] args) {
		StuData sd=new StuData();
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		String pass=sc.next();
		try {

			FileWriter fw=new FileWriter("D://FileConcept//pass.txt");
			fw.write(pass);
			fw.close();
			System.out.println("DONE!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
