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
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        padding: 40px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        width: 300px;
        height: 400px;
        text-align: center;
    }
    h1 {
        color: #ff0000;
    }
    a {
        display: block;
        margin: 10px 0;
        padding: 10px;
        text-decoration: none;
        color: #fff;
        background-color: navy;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <%
        AdminBean ab = (AdminBean)application.getAttribute("ubean");
        out.println("<h1>Welcome " + ab.getFname() + "</h1>");
        %>
        <a href="profile">VIEW PROFILE?</a><br>
        <a href="view">VIEW BOOK?</a><br>
        <a href="addBook.html">ADD BOOK?</a><br>
        <a href="logout">LOGOUT</a>
    </div>
</body>
</html>