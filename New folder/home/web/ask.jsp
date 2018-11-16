<%-- 
    Document   : ask
    Created on : 14 Nov, 2018, 10:48:02 AM
    Author     : Intel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2></h2>

<button onclick="myFunction()">Add</button>

<p id="demo"></p>

<script>
function myFunction() {
    var txt;
    var person = prompt("Ask Your Question :", "?");
    if (person == null || person == "") {
        txt = "User cancelled the prompt.";
    } else {
        txt = " " + person + " let Me think !!";
    }
    document.getElementById("demo").innerHTML = txt;
}
</script>

</body>
</html>
