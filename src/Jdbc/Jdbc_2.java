package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class Jdbc_2
{

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","sql123");
			int[] empno= {7369,7499,7521,7566,7654,7698,7782,7788,7839,7844,7876,7900,7902,7934};
			String [] ename= {"SMITH","ALLEN","WARD","JONES"," MARTIN","BLAKE","CLARK","SCOTT","KING","TURNER","ADAMS","JAME","SFORD","MILLER"};  
			String [] job= {"CLERK","SALESMAN","SALESMAN","MANAGER","SALESMA","MANAGER","MANAGER","ANALYST","PRESIDE","SALESMAN","CLERK","CLERK","ANALYS","CLERK "};    
			int [] mgr= {7902,7698,7698,7839,7698,7839,7839,7566,7698,7788, 7698 ,7566 ,7782,7782};
			int [] sal= {800,1600,1250,2975 ,1250 ,1285 ,2450 ,3000, 5000, 1500, 1100, 950,3000,1300};
			int [] deptno= {20,30,30,20,30,30,10,20,10,30,20,30,20,10};
			Statement stmt = con.createStatement();
		
			for(int i=0;i<ename.length;i++)
			{
				String query="insert into emp(empno,ename,job,mgr,sal,deptno) value("+empno[i]+",'"+ename[i]+"',"
						+ "'"+job[i]+"',"+mgr[i]+","+sal[i]+","+deptno[i]+")";
 
			    stmt.executeUpdate(query);
			}
			System.out.println("Value inserted");
			
			
			
		
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		

	}
}


