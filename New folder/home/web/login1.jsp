<%-- 
    Document   : login1
    Created on : 13 Nov, 2018, 10:44:06 AM
    Author     : Intel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            try{
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            String myurl="jdbc:mysql://localhost/login";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");
                Statement st=conn.createStatement();
                String query1="select * from mk where username='"+username+"' and password='"+password+"'";
                ResultSet rs=st.executeQuery(query1);
                
            if(rs.next())
                out.println("<script>setTimeout(function(){window.location='homee1.html'},1*1000)</script>");
                else
                 out.println("not found");
                st.close();
            
            }
            catch(Exception e)
            {
                System.err.println("got an exception");
                System.err.println(e.getMessage());
            }
   
        %>
    </body>
</html>
