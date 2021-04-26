<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8"  language="java"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Вывод</title>
</head>
<body>
<h2>Список</h2>
<form method="get" action="info">
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>FIO</th>
            <th>Number</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${listInfo}" var="info">
            <tr>
                <td>${info.idinfo}</td>
                <td>${info.fio}</td>
                <td>${info.number}</td>
                <td>${info.address}</td>
            </tr>
        </c:forEach>
    </table>
     <a href="${pageContext.request.contextPath}/">Выход</a>
    <a href="${pageContext.request.contextPath}/welcome">Назад</a>
</form>
</body>
</html>