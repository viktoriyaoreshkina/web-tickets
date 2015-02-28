<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1>

<form action="/controller" method="post">
    <input name="action" value="register" type="hidden"/>
    ${loginError}
    <button type="submit" name="action" value="register"></button>
</form>

</html>
