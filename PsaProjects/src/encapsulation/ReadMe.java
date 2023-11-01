package encapsulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadMe {
	public static void main(String[] args) {
		StuData sd=new StuData();
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		String pass=sc.next();
		try {
			FileWriter fw=new FileWriter("D://FileConcept//secret.txt");
			fw.write(pass);
			fw.close();
			System.out.println("Pass word is added");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
