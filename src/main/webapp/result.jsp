<%--
  Created by IntelliJ IDEA.
  User: eberk
  Date: 01.12.2021
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h1>Result is ${bean.num}</h1>
    <form action="clear" method="get">
        <input type="submit" name="btn" value="Clear">
        <input type="submit" name="btn" value="Back">
    </form>
</body>
</html>
