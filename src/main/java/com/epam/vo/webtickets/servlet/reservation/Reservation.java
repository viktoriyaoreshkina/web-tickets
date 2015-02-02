package com.epam.vo.webtickets.servlet.reservation;

import com.epam.vo.webtickets.servlet.Dispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Reservation extends Dispatcher {
    public String getServletInfo(){
        return "Reservation servlet";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        if (request.getParameter("reservation")!=null) {

             String count_res_s = request.getParameter("count_res");
            int countRes = Integer.valueOf(count_res_s);


            Dispatcher newDispatcher = new Dispatcher();
            newDispatcher.setCountRes(countRes);

            ctx.setAttribute("count_res", newDispatcher);
            Dispatcher.setCountAll(Dispatcher.getCountAll() - countRes);

            this.forward("/reservation_sale/successReservation.jsp", request, response);
        } else if ((request.getParameter("cancel")!=null) & (Dispatcher.getCountAll() != 0) ){
            this.forward("/index.jsp", request, response);
        }
    }
}
