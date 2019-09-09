package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

	
	public boolean verifyUser(String username, String password) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register" ,"root","root");
			Statement s=con.createStatement();
			ResultSet rs =s.executeQuery("select * from registration where username ='"+username+"' && password='"+password+"'");
			rs.next();
			
			if(rs.getString("password").equals(password) && rs.getString("username").equals(username))
			{	
			return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
