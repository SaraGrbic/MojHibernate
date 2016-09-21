package com.love2code;                                                         
import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user= "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to database: " + url);
			
			Connection myConn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Connection successful!!!");
		}
		catch(Exception exc)
		
		{
			exc.printStackTrace();
		}

	}

}
