package Jdbc;

import java.sql.*
;
import java.sql.DriverManager;
import java.sql.Statement;

public class FistJdbc
{

	public static void main(String[] args)
	{
	     try {
			Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","sql123");
		   Statement stmt = con.createStatement();
		    String query="create table emp(EMPNO int(5),ENAME varchar(15),JOB varchar(15),MGR int(9),SAL int(9),DEPTNO int(5))";
		     stmt.executeUpdate(query);
		     System.out.println("table created");
		}
	     catch (Exception e) 
	     {
			
			System.out.println(e);
		}

	}

}
