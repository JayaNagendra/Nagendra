package com.Nagendra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class my_sql_Select {

	public static void main(String[] args) throws SQLException {
		
		// 1.Create a connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nagendradb","root","Nagendra@44");
			 
				// 2. Create a statement / query
				Statement stmt=con.createStatement();
				
				String s="select * from student";
				
				// 3. Exicute statement & Store Data in Resultset
				
				ResultSet rs=stmt.executeQuery(s);
				
				while(rs.next()) {
					int eid=rs.getInt("sno");
				String st1=	rs.getString("sname");
				String st2=	rs.getString("course");
				
				System.out.println(eid+"  "+st1+"  "+st2);
				
				}
				
				//4. Close connection
				
				con.close();
				
				System.out.println("Query exicuted");
	}

}
