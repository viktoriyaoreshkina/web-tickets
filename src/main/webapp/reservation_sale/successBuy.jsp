<%@ page import="com.epam.vo.webtickets.servlet.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Покупка билетов</title>
</head>
<body>
<form action="SuccessBuy" method="post">
  <h2>Покупка успешно завершена</h2>
  <jsp:useBean id="dispatcher" class="com.epam.vo.webtickets.servlet.Dispatcher" scope="application"/>
  Осталось свободных билетов: <%= dispatcher.getCountAll()%><br>
  Куплено билетов: <%= dispatcher.getCountBuy()%><br>                   <%--не складывает. исправить!--%>
  Забронировано билетов: <%= dispatcher.getCountRes()%><br>             <%--не складывает. исправить!--%>
  <p>
  <table>
    <tr>
      <th><small>
        <input type="submit" name="buy" value="Купить еще билеты">
      </small>
      <th><small>
        <input type="submit" name="reservation" value="Забронировать билеты">
      </small>
      <th><small>
        <input type="submit" name="cancel" value="На главную">
      </small>
  </table>
</form>


</body>
</html>
