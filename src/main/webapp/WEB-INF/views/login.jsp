<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login page</h1>
        <h4 style="color: maroon">${errorMsg}</h4>
        <form method="post" action="${pageContext.request.contextPath}/login">
            Please enter your login: <input type="text" name="login" maxlength="25" required>
            Please enter your password: <input type="password" name="password" maxlength="255" required>
            <button type="submit">Login</button>
        </form>
        <h4><a href="${pageContext.request.contextPath}/drivers/add">Register as a driver</a></h4>
    </body>
</html>
