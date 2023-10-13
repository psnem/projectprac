package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteMyFile {

	public static void main(String[] args) {
		System.out.println("Enter the file name");
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		File f=new File("D://FileConcept//"+fname+".txt");
		try {
			FileWriter fw=new FileWriter(f);
			FileReader fr=new FileReader(f);
			System.out.println("Enter the message");
			String msg=new String(sc.nextLine());
			fw.write(msg);
			
			
			
			fw.close();
			//Reading file
			Scanner sc2=new Scanner(f);
			while(sc2.hasNext()) {
				System.out.print(sc2.next()+" ");
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
