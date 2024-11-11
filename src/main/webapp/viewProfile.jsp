<%@page import="com.test.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="profile.css" rel="stylesheet">
</head>
<div class="container">
    <h1>Admin Information</h1>
    <%
    String fname = (String)request.getAttribute("fname");
    AdminBean ab = (AdminBean)application.getAttribute("ubean");
    %>
    <div class="info">
        <span>Page belongs to <%= fname %></span>
        <span><%= ab.getFname() %> &nbsp;<%= ab.getLname() %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%= ab.getMail() %> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%= ab.getMob() %></span>
    </div>
    <a href="edit">EDIT</a>
    <a href="logout">LOGOUT</a>
</div>
</body>
</html>