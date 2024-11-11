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
    }

    .message {
    margin:20px auto;
    font-size:20px;
    padding:30px;
    width:36%;
    background:#CCCCFF;
    text-align:center;
        color: blue;
        font-size: 18px;
    }

    .login-form {
        margin: 0 auto;
        width: 300px;
    }

    .login-form input {
        display: block;
        width: 100%;
        margin-bottom: 10px;
        padding: 8px;
    }

    .login-form button {
        padding: 10px;
        background-color: #4CAF50;
        color: white;
        border: none;
        cursor: pointer;
    }

    .login-form button:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<%
    String msg = (String)request.getAttribute("msg");
if (msg != null) {
    out.println("<div class='message'>" + msg + "</div>");
}
    %>
   <%@include file="login.html" %>

</body>
</html>
