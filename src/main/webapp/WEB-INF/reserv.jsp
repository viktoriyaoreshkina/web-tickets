<%@ page import="com.epam.vo.webtickets.action.ReservAction" %>
<%--
  reservation tikets
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="/controller" method="post">
     <%-- <jsp:useBean id="ReservAction" class="com.epam.vo.webtickets.action.ReservAction" scope="application"/>--%>
      <p></p>Сейчас <%= ReservAction.getI()%> свободных билетов по цене <input type="text" name="count_buy" size="10"></p>
      <p>Я хочу забронировать <input type="text" name="count_buy" size="10"> билетов.</p>
      <p>Общая стоимость заказа составит: <%= ReservAction.getI()*2%><input type="text" name="count_buy" size="10"></p>
      <input name="action" value="reserv" type="submit"/>
      <input name="action" value="cancel" type="submit"/>
    </form>

</body>
</html>
