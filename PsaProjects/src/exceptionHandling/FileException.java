package exceptionHandling;
import java.io.*;
public class FileException {
	public static void main(String[] args) {
		
		PrintWriter pw;
		try {
			pw=new PrintWriter("xyzzz.tct");
			pw.println("saved");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of the code");
		
	}

}
