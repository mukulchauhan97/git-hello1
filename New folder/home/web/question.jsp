<%-- 
    Document   : question
    Created on : 26 Nov, 2018, 11:24:02 AM
    Author     : Intel
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String question=request.getParameter("ques");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
Statement st=conn.createStatement();
String query1="select question from mk1";
ResultSet rs=st.executeQuery(query1);
while(rs.next())
{
    String a=rs.getString("question");
    out.println(a);
    %>
    <br>
    <%
}
%>

