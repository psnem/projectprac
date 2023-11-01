package encapsulation;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;



public class SetWithJDBC {
public static void main(String[] args) {
	System.out.println("Enter the name : ");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	System.out.println("Enter the password : ");
	String pass=sc.next();
	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","4123");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into secret value ('"+name+"','"+pass+"') ");
			con.close();
			System.out.println("DONE!!!");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
