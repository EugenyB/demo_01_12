<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
    <form action="hello-servlet" method="post">
        <label for="number">Number</label>
        <input type="number" id="number" name="numField">
        <input type="submit" value="Send">
    </form>
</body>
</html>