package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class Showdetails extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		try
		{    PrintWriter writer = resp.getWriter();
			HttpSession session = req.getSession();
			  String nam= (String) session.getAttribute("user");
	          
	          writer.println("Hello " + nam + " This is your personel info");
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register" ,"root","root");
	          Statement s=con.createStatement();
	          ResultSet rs =s.executeQuery("select * from registration where username ='"+nam+"'");
	          rs.next();
	          String r= rs.getString("name");
	          String a= rs.getString("email");
	          String b= rs.getString("username");
	          if( rs.getString("username").equals(nam))
	          {	
	           writer.print("name= "+r+" Email= "+a+" Username"+b);
	           
	          }
			}
		catch(Exception e) 
		{
			e.printStackTrace();
		
		}
	}
}

