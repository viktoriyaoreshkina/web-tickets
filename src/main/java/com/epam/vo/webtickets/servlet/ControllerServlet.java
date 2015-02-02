package com.epam.vo.webtickets.servlet;

import com.epam.vo.webtickets.action.Action;
import com.epam.vo.webtickets.action.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerServlet extends HttpServlet {

    /*
    * instead of doGet & doPost
    * */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod(); // GET or POST or HEAD
        /*
        * Register
        * Login
        * ShowUsers
        * ShowEvents
        * ShowEvent
        * ...
        * */
        String actionName = req.getParameter("action");
        Action action = ActionFactory.getAction(method, actionName);
        String view = action.execute(req, resp);
        if (view.startsWith("redirect:/")) {
            resp.sendRedirect(req.getContextPath()+"/controller?action="+view.substring(10));
        }
        req.getRequestDispatcher("/WEB-INF/" + view + ".jsp").forward(req, resp);

    }
}
