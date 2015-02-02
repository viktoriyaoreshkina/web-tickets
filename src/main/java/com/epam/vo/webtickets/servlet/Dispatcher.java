package com.epam.vo.webtickets.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Dispatcher extends HttpServlet {
    private static int countAll = 5;
    private static int countRes = 0;
    private static int countBuy = 0;

    public static int getCountAll() {
        return countAll;
    }

    public static void setCountAll(int countAll) {
        Dispatcher.countAll = countAll;
    }

    public static int getCountRes() {
        return countRes;
    }

    public static void setCountRes(int countRes) {
        Dispatcher.countRes = countRes;
    }

    public static int getCountBuy() {
        return countBuy;
    }

    public static void setCountBuy(int countBuy) {
        Dispatcher.countBuy = countBuy;
    }

    protected void forward(String address, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}



/* String count_res_s = request.getParameter("count_res");
            int countRes = Integer.valueOf(count_res_s);


            Dispatcher newDispatcher = new Dispatcher();
            newDispatcher.setCountRes(countRes);

            ctx.setAttribute("count_res", newDispatcher);
            Dispatcher.setCountRes(Dispatcher.getCountAll() - countRes);*/