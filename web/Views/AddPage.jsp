<%--
  Created by IntelliJ IDEA.
  User: Sikonder
  Date: 28.08.2017
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Второй этап</h1>

    <form action="/add">
        Имя<input name="name" type="text">
        Имя питомца<input name="petName" type="text">
        Кот или собака?<input name="petType" type="text">
        <input type="submit" value="Отправить">
    </form>
</body>
</html>
