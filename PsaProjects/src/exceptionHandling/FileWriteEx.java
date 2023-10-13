package exceptionHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String name=sc.nextLine();
		
		
         
	
		try {
			FileWriter fw=new FileWriter("D://FileConcept//"+name+".txt",true);// will not over write
			
			//String c=sc.nextLine();
	         
	         System.out.println("Enter the message");
			String str=sc.nextLine();
			
			fw.write(str);
			
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			

	}

}
