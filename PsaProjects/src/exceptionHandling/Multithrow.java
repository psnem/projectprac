package exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Multithrow {
	public static void main(String[] args) throws IOException, SQLException {
		
		FileWriter fw=new FileWriter("D://FileConcept//joy.txt");
		DriverManager.getConnection(null);
		
	}
	

}
