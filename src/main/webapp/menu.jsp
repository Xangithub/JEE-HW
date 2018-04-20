<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="menu">
    <ul>
        <li><a href="main.jsp">Главная страница</a></li>
        <li><a href="catalog.jsp">Каталог товаров</a></li>
        <%--<li><a href="/dz3/catalog">каталог товаров</a></li>--%>
        <li><a href="product.jsp">Товары </a></li>
        <%--<li><a href="cart.jsp">Корзина</a></li>--%>
        <%--Попытка сделать этот пункт так вызвала исключение. МОжно обсудить почему ?--%>
        <%--<li><jsp:include page="cart.jsp"/></li>--%>
        <li><a href="order.jsp">Заказать</a></li>
    </ul>
</div>