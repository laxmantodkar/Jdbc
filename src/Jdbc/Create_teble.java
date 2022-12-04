package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;


public class Create_teble {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","sql123");
			String q="create table laxman1(id int(3),name varchar(5))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
