package JdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
		  Statement stmt =con.createStatement();
		  ResultSet rs=stmt.executeQuery("select * from empl");
		  
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " +rs.getInt(4));
			  
		  }
		}
		
		catch(Exception e1)
		{
			e1.printStackTrace();
			
		}		
		finally {
			
			con.close();
			System.out.println("received the data");
		}
	}

}
