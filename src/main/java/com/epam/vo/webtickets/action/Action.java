package com.epam.vo.webtickets.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public interface Action {
    String execute(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException;
}
