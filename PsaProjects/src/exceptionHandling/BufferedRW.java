package exceptionHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedRW {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String name=sc.nextLine();
		try {
			File f=new File("D://FileConcept//"+name+".txt");
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter(f,true);
			BufferedReader br= new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println("Enter the message");
			String msg=sc.nextLine();
			bw.write(msg);
			bw.close(); //file is saved
			
			while(br.readLine()!=null)
				System.out.println(br.readLine());
				
			
			

		}
		catch(Exception e) {}
	}

}
