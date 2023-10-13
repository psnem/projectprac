package exceptionHandling;

import java.io.File;
import java.util.Scanner;

public class FileInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the file");
		String fname=sc.next();
		File f=new File("D://"+fname+".txt");
		if(f.exists())
		{
			System.out.println("Name of the file is : "+f.getName());
			System.out.println("Path of the file is : "+f.getAbsolutePath());
			System.out.println("Space of the file is : "+f.getTotalSpace());
			System.out.println("Length of the file is : "+f.length());
			System.out.println("Can we read the file? : "+f.canRead());
			System.out.println("Can we write the file? : "+f.canWrite());
			System.out.println("Can we execute the file? : "+f.canExecute());
		}
		else
			System.out.println("File does not exist");
	}

}
