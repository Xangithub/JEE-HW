<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<style></style>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/style.css">
    <% final String namePage = "Корзина"; %>
    <title><%=namePage%>
    </title>
</head>
<body>
<%@include file="menu.jsp" %>
<h2><%= namePage %>
</h2>
А это текст ссыки
<%=request.getRequestURI()%>

</body>
</html>
