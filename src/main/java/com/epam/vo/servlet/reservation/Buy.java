package com.epam.vo.servlet.reservation;


import com.epam.vo.servlet.Dispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Buy extends Dispatcher{
    public String getServletInfo(){
        return "Reservation servlet";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        if (request.getParameter("buy")!=null) {

            String count_buy_s = request.getParameter("count_buy");
            int countBuy = Integer.valueOf(count_buy_s);


            Dispatcher newDispatcher = new Dispatcher();
            newDispatcher.setCountBuy(countBuy);

            ctx.setAttribute("count_buy", newDispatcher);
            Dispatcher.setCountAll(Dispatcher.getCountAll() - countBuy);

            this.forward("/reservation_sale/successBuy.jsp", request, response);
        } else if ((request.getParameter("cancel")!=null) & (Dispatcher.getCountAll() != 0) ){
            this.forward("/index.jsp", request, response);
        }
    }
}
