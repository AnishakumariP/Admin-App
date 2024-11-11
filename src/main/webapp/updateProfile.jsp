<%@page import="com.test.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 20px;
    }
    h1 {
        color: #333;
    }
    p {
        font-size: 16px;
    }
    a {
        text-decoration: none;
        color: #007BFF;
        padding: 10px 15px;
        border: 1px solid #007BFF;
        border-radius: 4px;
        margin-right: 10px;
    }
    a:hover {
        background-color: #007BFF;
        color: #fff;
    }
</style>
</head>
<body>
<%
String fn = (String)request.getAttribute("fname");
String msg = (String)request.getAttribute("msg");
out.println("<h1>Page belongs to "+fn+"</h1>");
out.println("<p>"+msg+"</p>");
%>
<a href="profile">View Profile</a>
<a href="logout">Logout</a>
</body>
</html>