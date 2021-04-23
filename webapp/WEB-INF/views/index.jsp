<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Manager</title>
</head>
<body>
<div align="center">
    <h3><a href="${pageContext.request.contextPath}/new">Register</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Password</th>
            <th>E-mail</th>
        </tr>
        <c:forEach items="${listUser}" var="user">
            <tr>
                <td>${user.id_user}</td>
                <td>${user.name}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>


<form action="Login" method="post">
    Enter name: <input type="text" name="name"><br>
    Enter password: <input type="password" name="pass"><br>
    <input type="submit" value="login"><br>

</form>
</div>
</body>
</html>