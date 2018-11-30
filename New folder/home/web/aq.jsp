<%-- 
    Document   : aq
    Created on : 20 Nov, 2018, 9:42:26 AM
    Author     : Intel
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String username=request.getParameter("username");
String question=request.getParameter("ques");
String email=request.getParameter("email");
String id=request.getParameter("id");

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into mk1(email,username,question,id)values('"+email+"','"+username+"','"+question+"','"+id+"')");
if(i==1)
{
    out.println("Succesfull");
}
%>
