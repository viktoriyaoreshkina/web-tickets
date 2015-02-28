<%@ page import="com.epam.vo.webtickets.action.SuccessReservAction" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/controller" method="get">
  Успешная регистрация
  <p>Вы забронировали <%= SuccessReservAction.getSr()%> билетов общей стоимостью <input type="text" name="count_buy" size="10"></p>
  <%-- <jsp:useBean id="ReservAction" class="com.epam.vo.webtickets.action.ReservAction" scope="application"/>--%>
  <p></p>Сейчас <%= SuccessReservAction.getSf()%> свободных билетов по цене <input type="text" name="count_buy" size="10"></p>


  <input name="action" value="reserv" type="submit"/>
  <input name="action" value="cancel" type="submit"/>
</form>

</body>
</html>
