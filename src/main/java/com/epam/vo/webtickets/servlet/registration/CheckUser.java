package com.epam.vo.webtickets.servlet.registration;


import com.epam.vo.webtickets.servlet.Dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckUser extends Dispatcher {
    public String getServletInfo() {
        return "Registration servlet";
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = UserList.findUser(request.getParameter("user"));
        if (user == null){
            this.forward("/registration/registration.html", request, response);
        } else {
            if
                    (!user.getPassword().equals(request.getParameter("password"))){
                this.forward("/registration/registration.html", request, response);
            } else {
                this.forward("/registration/successLogin.jsp", request, response);
            }
        }
    }

}
