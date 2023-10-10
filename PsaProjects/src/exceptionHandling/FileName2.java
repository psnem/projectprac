package exceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileName2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the file name");
		String name=sc.next();
//		System.out.println(name);
	//	String name2="D://"+name+".txt";
		//System.out.println(name2);
		File f=new File("D://"+name+".txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		System.out.println(name+" is created");
	}

}
