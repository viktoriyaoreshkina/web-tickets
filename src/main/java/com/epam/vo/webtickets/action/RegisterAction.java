package com.epam.vo.webtickets.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction implements Action {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        // TODO validate params
        // TODO if not valid
//        request.setAttribute("loginError", "login is incorrect");
//        return "register";

        // TODO insert user into db logic

        return "redirect:/successRegister";
    }
}
