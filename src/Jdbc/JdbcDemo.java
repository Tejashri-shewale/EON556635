package Jdbc;
import java.sql.*;
 class JdbcDemo
{

	public static void main(String[] args) throws SQLException
	{
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql:///Student_Demo","root","root");  
			
			Statement stmt=con.createStatement(); 
//			String Query="create table student(id int,name varchar(20))";
//			stmt.executeUpdate(Query);
//			
//			String Query="insert into student values(3,'aadnya')";
//			stmt.executeUpdate(Query);
			String Query="select id,name from student";
			ResultSet rs=stmt.executeQuery(Query);
			while(rs.next())
			{
				System.out.println(" \t "+rs.getInt("id")+" \t "+rs.getString("name"));
			}

		}
		
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
			
	}  
		
}
	



