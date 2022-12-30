package com.Nagendra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class my_sql_commands {

	public static void main(String[] args) throws SQLException {
      
		       //  .........    UPDATE............
		
		
		// 1.Create a connection
	/*Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nagendradb","root","Nagendra@44");
 
	// 2. Create a statement / query
	Statement stmt=con.createStatement();
	
	String s="INSERT INTO student values(7,'Hibernate','Nagendra')";
	
	// 3. Exicute statement
	
	stmt.execute(s);
	
	//4. Close connection
	
	con.close();
	
	System.out.println("Query exicuted");*/
	
		
		       //  ..........DELETE.......
		
		// 1.Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nagendradb","root","Nagendra@44");
	 
		// 2. Create a statement / query
		Statement stmt=con.createStatement();
		
		String s="DELETE FROM student WHERE sno=7";
		
		// 3. Exicute statement
		
		stmt.execute(s);
		
		//4. Close connection
		
		con.close();
		
		System.out.println("Query exicuted");
		
	}

}
