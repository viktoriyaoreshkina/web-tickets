<%@ page import="com.epam.vo.servlet.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Покупка билетов</title>
</head>
<body>
<br>
<h1>Покупка билетов</h1>
<form action="Buy" method="post">
  <jsp:useBean id="dispatcher" class="com.epam.vo.servlet.Dispatcher" scope="application"/>
  Сейчас свободных билетов: <%= dispatcher.getCountAll()%><br>
  Дата концерта:      <input type="text" name="date" size="10"><br>
  Название концерта:  <input type="text" name="name_concert" size="10"><br>
  Цена билета:        <input type="text" name="prise" size="10"><br>
  Количество покупаемых билетов: <input type="text" name="count_buy" size="10"><br>
  Выберете способ оплаты:        <input type="text" name="prise" size="10"><br>
  <h4>Прежде чем нажать "Купить", пожалуйста, проверьте еще раз все введенные данные</h4>
  <p>
  <table>
    <tr>
      <th><small>
        <input type="submit" name="buy" value="Купить">
      </small>
      <th><small>
        <input type="submit" name="cancel" value="Отмена">
      </small>
  </table>
</form>
<br>
</body>
</html>





