<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.io.PrintWriter" %><%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> User List</h1>
<table border="1">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>email</td>
        <td>gender</td>
        <td>birthDate</td>
    </tr>

    <tr>
        <td><%=request.getAttribute("id")%></td>
        <td><%=request.getAttribute("username")%></td>
        <td><%=request.getAttribute("password")%></td>
        <td><%=request.getAttribute("email")%></td>
        <td><%=request.getAttribute("gender")%></td>
        <td><%=request.getAttribute("birthDate")%></td>
    </tr>
</table>
<%@include file="footer.jsp"%>