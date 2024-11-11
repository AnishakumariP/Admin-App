<%@page import="com.test.BookBean"
import = "java.util.List"%>
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
        color: #333;
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        padding: 12px;
        border: 1px solid #ddd;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
    }
    .title {
        font-size: 24px;
        margin-bottom: 20px;
    }
</style>
</head>
<body>
<%
String fname = (String)request.getAttribute("fname");
List<BookBean> bb1 = (List<BookBean>)session.getAttribute("bk");
%>
<div class="title">Page belongs to <%= fname %></div>
<table>
    <tr>
        <th>Book Code</th>
        <th>Book Name</th>
        <th>Author</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
    <%
    for(BookBean bb : bb1){
    %>
    <tr>
        <td><%= bb.getBcode() %></td>
        <td><%= bb.getBname() %></td>
        <td><%= bb.getAuthor() %></td>
        <td><%= bb.getPrice() %></td>
        <td><%= bb.getQty() %></td>
    </tr>
    <%
    }
    %>
</table>
</body>
</html>