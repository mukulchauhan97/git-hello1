<%-- 
    Document   : ask
    Created on : 14 Nov, 2018, 10:48:02 AM
    Author     : Intel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    background-image: url("wp1949787.jpg");
}
input[type=text] {
    width: 50%;
    padding: 6px 10px;
    margin: 8px 0;
    box-sizing: border-box;
    border-radius: 8px;
    border-color: grey;
}
</style>
    </head>
<body>
    <form action="aq.jsp" method="POST">
<h2></h2>
<center>
<button class="button button3" onclick="myFunction()">Add Your Questions.....</button>
</center>
<center>
<textarea name="ques"></textarea>
<br><br>
    
<input type="text" name="username" placeholder="username"><br><br>
<input type="text" name="email" placeholder="email"><br><br>
<input type="text" name="id" placeholder="id"><br><br>
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
<input type="submit" value="Submit Your Question" class="button button3">
</center>
    </form>
</body>
</html>
