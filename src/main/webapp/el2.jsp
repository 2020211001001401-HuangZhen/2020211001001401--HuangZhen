<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo 4- week 11</title>
</head>
<body>
<h2>Get request parameters - using EL Code</h2>
name:${param.name}<br>
id:${param.id}<br>
subject:${paramValues.subject[0]},${paramValues.subject[1]},${paramValues.subject[2]}<br>
<h2>Get request header using ELCode</h2>
Host:${hesder.host}<br>
Accept:${header.Accept}<br>
<hr>

<h2>User pageContext</h2>
session id:${pageContext.session.id}<br>
request method:${pageContext.request.method}<br>
<hr>

<%--<h2>Use empty operator</h2>--%>
<%--${empty str}<br>--%>
<%--<% ArrayList<User> userList=new userList<User>();--%>
<%--    userList.add(new User());--%>
<%--%>--%>
${empty userList}<br>
${empty param.name11111}
</body>
</html>
