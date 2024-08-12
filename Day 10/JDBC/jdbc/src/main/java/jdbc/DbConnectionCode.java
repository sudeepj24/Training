package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnectionCode {
	
	
	public static Connection con=null;
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","india@12");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void  insert(int id,String author,String name,String price) throws SQLException
	{
		String query="INSERT INTO book values(?,?,?,?)";
		con=getConnection();
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1, id);
		stmt.setString(2, author);
		stmt.setString(3, name);
		stmt.setString(4, price);
		int result=stmt.executeUpdate();
		if(result==1)
		{
			System.out.print("Added");
		}
		else {
			System.out.print("Not Added");
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		insert(77,"Sudeeep","JAVA","6000");
		
	}
}
