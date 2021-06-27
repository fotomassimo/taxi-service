<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
    <head>
        <title>Add driver</title>
    </head>
    <body>
        <form method="post" id="driver" action="${pageContext.request.contextPath}/drivers/add"></form>
        <h1 class="table_dark">Add driver profile:</h1>
        <table border="1" class="table_dark">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>License number</th>
                <th>Login</th>
                <th>Password</th>
                <th>Add</th>
            </tr>
            <tr>
                <td>
                    <input type="text" name="first_name" maxlength="255" form="driver" required>
                </td>
                <td>
                    <input type="text" name="last_name" maxlength="255" form="driver" required>
                </td>
                <td>
                    <input type="text" name="license_number" maxlength="255" form="driver" required>
                </td>
                <td>
                    <input type="text" name="login" maxlength="25" form="driver" required>
                </td>
                <td>
                    <input type="password" name="password" maxlength="255" form="driver" required>
                </td>
                <td>
                    <input type="submit" name="add" form="driver">
                </td>
            </tr>
        </table>
    </body>
</html>
