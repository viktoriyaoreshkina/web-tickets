
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Форма входа в систему</title>
</head>
<body>
<br>
<h1>Вход в систему</h1>
<form action="Registration" method="post">
  <jsp:useBean id="dispatcher" class="com.epam.vo.webtickets.servlet.Dispatcher" scope="application"/>
  Сейчас свободных билетов: <%= bd dispatcher.getCountAll()%><% try {
} catch (Exception e) {
} %><br>
  Пользователь: <input type="text" name="user" size="10"><br>
  Пароль: <input type="password" name="password" size="10"><br>
  <p>
  <table>
    <tr>
      <th><small>
        <input type="submit" name="login" value="Войти в систему">
      </small>
      <th><small>
        <input type="submit" name="registration" value="Зарегистрироваться">
      </small>
      <th><small>
        <input type="submit" name="reservation" value="Забронировать билет">
      </small>
      <th><small>
        <input type="submit" name="buy" value="Купить билет">
      </small>
  </table>
</form>
<br>
</body>
</html>
