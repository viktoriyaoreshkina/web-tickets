package com.epam.vo.webtickets.servlet.reservation;


import com.epam.vo.webtickets.servlet.Dispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SuccessReservation extends Dispatcher {

    public String getServletInfo() {
        return "Registration servlet";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        if ((request.getParameter("reservation") != null) & (Dispatcher.getCountAll() != 0)) {
            this.forward("/reservation_sale/reservation.jsp", request, response);
        }
        if ((request.getParameter("buy") != null) & (Dispatcher.getCountAll() != 0)) {
            this.forward("/reservation_sale/buy.jsp", request, response);
        } else if ((request.getParameter("reservation") != null) || (request.getParameter("buy") != null) & (Dispatcher.getCountAll() == 0)) {
            this.forward("/reservation_sale/noTicket.html", request, response);
        }
        if (request.getParameter("cancel") != null) {
            this.forward("/index.jsp", request, response);
        }
    }
}