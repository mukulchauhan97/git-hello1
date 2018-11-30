<%-- 
    Document   : give
    Created on : 26 Nov, 2018, 7:16:24 PM
    Author     : Intel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
.button3 {padding: 14px 40px;}
textarea {
    width: 50%;
    height: 150px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: #f8f8f8;
    font-size: 16px;
    resize: none;
}
body 
{
    background-image: url("ss.jpg");
}
input[type=text] {
    width: 50%;
    padding: 6px 10px;
    margin: 8px 0;
    box-sizing: border-box;
    border-radius: 8px;
    border-color: grey;
}
#p {
    background-color: white;
    border: 5px solid black;
    padding: 25px;
    margin: 25px;
}

</style>
    </head>
<body>
    <form action="q_sub.jsp" method="post">
<h2></h2>
<center>
<button class="button button3" onclick="myFunction()">Add Your Answer.....</button>
</center>
<center>
</center>

<script>
function myFunction() {
    var txt;
    var person = prompt("Ask Your Question :", "?");
    if (person == null || person == "") {
        txt = "User cancelled the prompt.";
    } else {
        txt = " " +person;
    }
    document.getElementById("my").innerHTML = txt;
}
</script>
<center>
    <div id="p">
        
    <%
        
        Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
Statement st=conn.createStatement();
String query1="select * from mk1 where answers is NULL";
ResultSet rs=st.executeQuery(query1);
String arr[]=new String[100];
int i=0;
while(rs.next())
{
    String a=rs.getString("question");
    arr[i]=a;
    i++;
    %><h1><%out.println(a);
    %></h1>
    <br>
    <input type="text" name="ans">
    <input type="submit" onclick="<%session.setAttribute("ques",arr[0]);%>" value="Submit Your Answer" class="button button3">
    <br>
    <%
}

    %>
</center>
    </form>
</div>
</body>
</html>
