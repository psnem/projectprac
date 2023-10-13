package exceptionHandling;

import java.io.File;
import java.util.Scanner;

public class MyWindowExplorer {

	public static void main(String[] args) {
		System.out.println("Welcome to my windows explorer");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the drive name");
		String drive=sc.next();
		File f=new File(drive+"://");
		String[] s=f.list();
		System.out.println(s);
		for(String st:s)
			System.out.println(st);
		


	}

}
