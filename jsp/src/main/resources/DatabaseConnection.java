
public class DatabaseConnection {

	
	public void getConnection() {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register" ,"root","root");
		Statement s=con.createStatement();

		ResultSet rs =s.executeQuery("select * from registration where username='"+unm+"' && password='"+pass+"'");
		try
		{
		rs.next();
		if(rs.getString("password").equals(pass)&&rs.getString("username").equals(unm))
		{
			out.println("welcome   "+unm);
			session.setAttribute("user",unm);
			response.sendRedirect("user_section.jsp"); 
		}
		else
		{out.println("invalid username or password");}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
	}
	
}
