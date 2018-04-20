<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<style></style>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/style.css">
    <% final String namePage = "Каталог"; %>
    <title><%=namePage%>
    </title>
</head>
<body>
<%@include file="menu.jsp" %>
<h2><%= namePage %>
</h2>
А это текст ссыки
<%=request.getRequestURI()%>
<br>
<jsp:useBean id="productList" class="local.home.model.ProductList" scope="request"/>
<ul>
    <c:forEach items="${productList.productList}" var="product">
        <li style="list-style: none">${product}</li>
    </c:forEach>

</ul>

</body>
</html>
