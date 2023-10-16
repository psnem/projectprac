package exceptionHandling;

import java.io.FileWriter;

public class ImpFinally {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
		 fw=new FileWriter("D://FileConcept//joy.txt");
			fw.write("this is try block");
			int i=10/0; //exception occured now file close line will not be executed
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
