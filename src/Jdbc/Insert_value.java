package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_value {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","sql123");
		String q="insert into laxman(id) value(?)";
	    PreparedStatement stmt = con.prepareStatement(q);
	   
	    stmt.executeUpdate();
	      System.out.println("value inserted");
		}catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
