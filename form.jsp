<html>
   <head>
     
   </head>
   
   <body>
      <h1>your information</h1>
      <ul>
         <li><p><b>Name:</b>
            <%= request.getParameter("name")%>
         </p></li>
         <li><p><b>Email_id:</b>
            <%= request.getParameter("eid")%>
         </p></li>
         
         <li><p><b>Gender:</b>
            <%= request.getParameter("gender")%>
         </p></li>
         
         <li><p><b>Username:</b>
            <%= request.getParameter("uname")%>
         </p></li>
         <li><p><b>Password:</b>
            <%= request.getParameter("pass")%>
         </p></li>
      </ul>
   
   </body>
</html>