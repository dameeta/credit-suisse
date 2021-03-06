package JdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDemo {

	static final String insertquery = "INSERT INTO producttable" + "(prid,pr_name,pr_description,price) values"
			+ "(?,?,?,?);";
	static final String updatequery = "update producttable set price= ? where pr_name =?;";

	public void recordinsert() throws SQLException, ClassNotFoundException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement pst = con.prepareStatement(insertquery);

			pst.setInt(1, 3);
			pst.setString(2, "Pencil");
			pst.setString(3, "Paper Pencil");
			pst.setDouble(4, 55.45);

			System.out.println(pst);
			pst.executeUpdate();

		} catch (SQLException sg) {

			sg.printStackTrace();

			con.close();
		}

	}

	public void record_list() throws SQLException
	{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
		  Statement stmt =con.createStatement();
		  ResultSet rs=stmt.executeQuery("select * from producttable");
		  
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " +rs.getDouble(4));
			  
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
	public void updaterecord() throws SQLException, ClassNotFoundException {

		System.out.println(updatequery);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement pst = con.prepareStatement(updatequery);
	   pst.setDouble(1,238.34 );
	   pst.setString(2,"PaperBox");
		
	}
		catch(SQLException sle)
		{
			sle.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		CrudDemo crd = new CrudDemo();

	//	crd.recordinsert();

		crd.record_list();
crd.updaterecord();
	}

}
