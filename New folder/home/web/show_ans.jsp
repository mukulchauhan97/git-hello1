<%-- 
    Document   : show_ans
    Created on : 27 Nov, 2018, 11:20:18 AM
    Author     : Intel
--%>

<%@page import="java.sql.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    
}
th, td {
    padding: 15px;
}
            </style>
    </head>
    <body>
        <%
            String ans=request.getParameter("ans");
            String ques=(String)session.getAttribute("ques");
            Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
Statement st=conn.createStatement();
String query1="select * from mk1 where answers is NOT NULL";
ResultSet rs=st.executeQuery(query1);
%>
<table style="width:100%">
    <tr>
    <th>Question</th>
    <th>Answers</th>
    </tr>
    <%
while(rs.next())
{
    %><tr><td><%out.println(rs.getString("question"));%></td>
    <td><%out.println(rs.getString("answers"));%></td>
   </tr><%
}
        %>
        </table>
    </body>
</html>
