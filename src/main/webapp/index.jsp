<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Register</title>
</head>
<body>
<h1>Register</h1>

<%--&lt;%&ndash;<c:redirect url="/controller">&ndash;%&gt;
&lt;%&ndash;"hidden"&ndash;%&gt;--%>
<form action="/controller" method="get">
  <p><img src="D:\images\organ1.jpg" alt="Афиша 1"></p>
  <input name="action" value="reserv" type="submit"/>
</form>

<form action="/controller" method="post">
  <style type="text/css">
    .block1 {
      width: 200px;
      background: #fc0;
      padding: 12px;
      padding-right: 70px;
      border: solid 1px black;
      float: left;
    }
    .block2 {
      width: 200px;
      background: #fc0;
      padding: 5px;
      border: solid 1px black;
      float: left;
      position: relative;
      top: 40px;
      left: -70px;
    }
  </style>
  <div class="block1">
  <p>Логин:<input name="login" type="text" placeholder="Введите логин" maxlength="30" size="30"> </p>
  <p>Пароль:<input name="pass" type="password" placeholder="Введите пароль" maxlength="30" size="30"> </p>
  <input name="action" value="enter" type="submit"/>
  ${loginError}
    <input name="action" value="Register" type="submit">
  </div>
</form>

</body>

</html>



<%--


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
  Сейчас свободных билетов: <%= dispatcher.getCountAll()%><% try {
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
--%>
