package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingEx {
	public static void main(String[] args) {
		File f=new File("D://joy.txt");
		try {
			Scanner sc=new Scanner(f);
			FileReader fr=new FileReader(f);
//			while(sc.hasNext()) {
//				String str=sc.next();
//				System.out.print(str+" ");
//			}
//			sc.close();
			System.out.println(f.length());
			try {
				for(int i=0;i<f.length();i++) {

					System.out.print((char)fr.read());
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
