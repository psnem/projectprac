package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WhileFile {
	static String name;
	static Scanner sc = new Scanner(System.in);

	public static void readFile() {
		System.out.println("Enter the name of the file");
		String name = sc.nextLine();
		try {
			File f = new File("D://FileConcept//" + name + ".txt");
			FileReader fr = new FileReader(f);

			Scanner sc2 = new Scanner(f);
			while (sc2.hasNext()) {
				System.out.print(sc2.next() + " ");
			}

			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {

		System.out.println("Enter the name of the file");
		String name = sc.nextLine();
		try {
			File f = new File("D://FileConcept//" + name + ".txt");
			FileWriter fw = new FileWriter(f);
			System.out.println("Enter you message to write");
			String msg = sc.nextLine();
			fw.write(msg);
			fw.close();
			Scanner sc2 = new Scanner(f);
			while (sc2.hasNext()) {
				System.out.print(sc2.next() + " ");

			}
		} catch (Exception e) {
		}

	}

	public static void createFile() {
		System.out.println("Enter the name of the file");
		name = sc.next();
		try {
			File f = new File("D://FileConcept//" + name + ".txt");
			System.out.println(f.createNewFile());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void createFolder() {

		System.out.println("Enter the name of the folder");
		name = sc.next();
		File f = new File("D://FileConcept//" + name);
		System.out.println(f.mkdir());
	}

	public static void deletFile() {

		System.out.println("Enter the name of the file");
		name = sc.next();
		File f = new File("D://FileConcept//" + name + ".txt");
		f.delete();
		System.out.println("File is deleted");
	}

	public static void deletFolder() {

		System.out.println("Enter the name of the folder");
		name = sc.next();
		File f = new File("D://FileConcept//" + name);
		f.delete();
		System.out.println("Folder is deleted");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String per;
		do {

			System.out.println("\nWhat do you want to do?");
			System.out.println(
					"Press A: create file, B:Create Folder,\nC:Delete File,D:Delet Folder,\nR:Read File W: Write File");
			String in = sc.next();
			switch (in.toUpperCase()) {
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
			case "R":
				readFile();
				break;
			case "W":
				writeFile();
				break;

			}

			System.out.println("\nDo you want to continue");
			per = sc.next();
			System.out.println(per);

		} while (per.equals("y"));

	}

}
