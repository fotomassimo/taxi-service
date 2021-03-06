<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
    <head>
        <title>Add car</title>
    </head>
    <body>
        <h4 style="color: #ce2020; text-align:center;">${errorMsg}</h4>
        <form method="post" id="car" action="${pageContext.request.contextPath}/cars/add"></form>
        <h1 class="table_dark">Add car:</h1>
        <table border="1" class="table_dark">
            <tr>
                <th>Model</th>
                <th>Manufacturer ID</th>
                <th>Add</th>
            </tr>
            <tr>
                <td>
                    <input type="text" name="model" form="car" maxlength="255" required>
                </td>
                <td>
                    <input type="number" name="manufacturer_id" form="car" required>
                </td>
                <td>
                    <input type="submit" name="add" form="car">
                </td>
            </tr>
        </table>
        <h4><a href="${pageContext.request.contextPath}/index">Return to main menu</a></h4>
    </body>
</html>
