package exceptionHandling;

import java.io.File;

public class FileExist {

	public static void main(String[] args) {
		File f= new File("D://Any.txt");
		System.out.println(f); // returns the address of the file
		System.out.println(f.exists());
		System.out.println(f.delete());
		File f2=new File("D://Batman2.txt");
		try {
			f2.createNewFile();
			System.out.println("File"+f2.getName()+" is created.");
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		File f3= new File("D://NewFolder2");
		boolean b3=f3.mkdir();
		System.out.println(b3);

	}

}
