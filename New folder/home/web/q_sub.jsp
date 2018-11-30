<%-- 
    Document   : q_sub
    Created on : 27 Nov, 2018, 11:03:10 AM
    Author     : Intel
--%>
<%@page import="java.sql.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String ans=request.getParameter("ans");
            String ques=(String)session.getAttribute("ques");
            Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
Statement st=conn.createStatement();
String query1="update mk1 set answers='"+ans+"' where question='"+ques+"'";
st.execute(query1);
        out.println("<script>alert('sucessfully submitted');setTimeout(function(){window.location='give.jsp'},1*1000)</script>");
        %>
        
    </body>
</html>
