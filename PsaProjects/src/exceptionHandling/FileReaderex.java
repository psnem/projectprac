package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderex {

	public static void main(String[] args) {
		
		try {
		File f=new File("D://practice.txt");
		FileReader fr=new FileReader(f);
//		//suppose file has just 4 char
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println(f.length());
		for(int i=0;i<f.length();i++)
		{
			System.out.print((char)fr.read());
		}
		
		char[] ch=new char[(int) f.length()];
		fr.read(ch);
		for(char c:ch)
			System.out.print(c);
		fr.close();
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
