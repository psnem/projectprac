package exceptionHandling;

import java.io.File;
import java.util.Scanner;



public class WhileFile {
	static String name;
	public static void createFile() {
		System.out.println("Enter the name of the file");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
	  	try {
			File f = new File("D://"+name+".txt");
			System.out.println(f.createNewFile());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void createFolder() {

		System.out.println("Enter the name of the folder");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		File f = new File("D://"+name);
		System.out.println(f.mkdir());
	}

	public static void deletFile() {

		System.out.println("Enter the name of the file");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		File f = new File("D://"+name+".txt");
		f.delete();
		System.out.println("File is deleted");
	}

	public static void deletFolder() {

		System.out.println("Enter the name of the folder");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		File f = new File("D://"+name);
		f.delete();
		System.out.println("Folder is deleted");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String per;
		do {
			
			System.out.println("What do you want to do?");
			System.out.println("Press A: create file, B:Create Folder,C:Delete File,D:Delet Folder");
			String in = sc.next();
			switch (in) {
			case "A":
				createFile();
				break;
			case "B":
				createFolder();
				break;
			case "C":
				deletFile();
				break;
			case "D":
				deletFolder();
				break;

			}

			System.out.println("Do you want to continue");
			per = sc.next();
			System.out.println(per);
			
		} while (per.equals("y"));
		
	}

}
