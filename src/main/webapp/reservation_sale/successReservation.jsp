<%@ page import="com.epam.vo.webtickets.servlet.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Бронирование билетов</title>
</head>
<body>
<form action="SuccessReservation" method="post">
  <h2>Бронирование успешно завершено</h2>
  <jsp:useBean id="dispatcher" class="com.epam.vo.webtickets.servlet.Dispatcher" scope="application"/>
  Осталось свободных билетов: <%= dispatcher.getCountAll()%><br>
  <p>
  <table>
    <tr>
      <th><small>
        <input type="submit" name="reservation" value="Забронировать еще билеты">
      </small>
      <th><small>
        <input type="submit" name="buy" value="Купить билеты">
      </small>
      <th><small>
        <input type="submit" name="cancel" value="На главную">
      </small>
  </table>
</form>


</body>
</html>
