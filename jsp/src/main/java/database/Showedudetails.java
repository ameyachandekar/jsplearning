package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class Showedudetails extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		try
		{    PrintWriter writer = resp.getWriter();
			HttpSession session = req.getSession();
			  String nam= (String) session.getAttribute("user");
	          
	          writer.println("Hello " + nam + " This is your educational info");
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register" ,"root","root");
	          Statement s=con.createStatement();
	          ResultSet rs =s.executeQuery("select * from educationd ");
	          rs.next();
	          String r= rs.getString("graduation");
	          String a= rs.getString("branch");
	          String b= rs.getString("cname");
	        
	           writer.print("name= "+r+" Email= "+a+" Username"+b);
	           
	          
			}
		catch(Exception e) 
		{
			e.printStackTrace();
		
		}
	}
}

