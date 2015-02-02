<%@ page import="com.epam.vo.servlet.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Бронирование билетов</title>
</head>
<body>
<br>
<h1>Бронирование билетов</h1>
<form action="Reservation" method="post">
    <jsp:useBean id="dispatcher" class="com.epam.vo.servlet.Dispatcher" scope="application"/>
    Сейчас свободных билетов: <%= dispatcher.getCountAll()%><br>
    Дата концерта:      <input type="text" name="date" size="10"><br>
    Название концерта:  <input type="text" name="name_concert" size="10"><br>
    Цена билета:        <input type="text" name="prise" size="10"><br>
    Количество бронируемых билетов: <input type="text" name="count_res" size="10"><br>
    <h4>Прежде чем нажать "Забронировать", пожалуйста, проверьте еще раз все введенные данные</h4>
    <p>
    <table>
        <tr>
            <th><small>
                <input type="submit" name="reservation" value="Забронировать">
            </small>
            <th><small>
                <input type="submit" name="cancel" value="Отмена">
            </small>
    </table>
</form>
<br>
</body>
</html>




