<%@page import="com.test.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit profile</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 20px;
        
    }
    h1 {
    text-align:center;
        color: #333;
    }
    form {
        background: #fff;
        margin:auto;
        padding: 40px;
        width:40%;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    input[type="text"], input[type="email"], input[type="number"] {
        width: 70%;
        padding: 10px;
        margin: 10px 0;
        box-sizing: border-box;
    }
    input[type="submit"] {
        background-color: #007BFF;
        color: #fff;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
        border-radius: 5px;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<%
String fn = (String)request.getAttribute("fname");
AdminBean ab = (AdminBean)application.getAttribute("ubean");
out.println("<h1>Page belongs to "+fn+"</h1>");
%>
<form action="update" method="post">
    <label for="fname">First Name:</label>
    <input type="text" id="fname" name="fname" value="<%=ab.getFname()%>"><br>
    <label for="lname">Last Name:</label>
    <input type="text" id="lname" name="lname" value="<%=ab.getLname()%>"><br>
    <label for="mail">Mail id:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="email" id="mail" name="mail" value="<%=ab.getMail()%>"><br>
    <label for="mobile">Mobile No:</label>
    <input type="number" id="mobile" name="mobile" value="<%=ab.getMob()%>"><br>
    <input type="submit" value="Update"><br>
</form>
</body>
</html>