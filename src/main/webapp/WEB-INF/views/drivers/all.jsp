<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
    <head>
        <title>All drivers</title>
    </head>
    <body>
        <h1 class="table_dark">All drivers:</h1>
        <table border="1" class="table_dark">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>License number</th>
                <th>Login</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="driver" items="${drivers}">
                <tr>
                    <td>
                        <c:out value="${driver.id}"/>
                    </td>
                    <td>
                        <c:out value="${driver.firstName}"/>
                    </td>
                    <td>
                        <c:out value="${driver.lastName}"/>
                    </td>
                    <td>
                        <c:out value="${driver.licenseNumber}"/>
                    </td>
                    <td>
                        <c:out value="${driver.login}"/>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/drivers/delete?id=${driver.id}">DELETE</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h4><a href="${pageContext.request.contextPath}/drivers/add">Add a new driver</a></h4>
        <h4><a href="${pageContext.request.contextPath}/index">Return to main menu</a></h4>
    </body>
</html>
