package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_3
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","sql123");
			Statement stmt = con.createStatement();
			String q="select * from emp";
			ResultSet rs = stmt.executeQuery(q);
			while(rs.next())
			{
			System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
