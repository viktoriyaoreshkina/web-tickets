package com.epam.vo.webtickets.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessRegisterAction implements Action {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
//      any db logic here
        return "register";
    }
}
