package com.epam.vo.webtickets.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private static Map<String, Action> actions = new HashMap<>();

    static {
//        actions.put("GET/", new RegisterFormAction());
       /* actions.put("POST/register", new RegisterFormAction());
        actions.put("POST/enter", new RegisterAction());
//        TODO create successRegister
        actions.put("GET/successRegister", new SuccessRegisterAction());
        actions.put("GET/index", new RegisterFormAction());
        actions.put("GET/index", new RegisterAction());*/

        actions.put("GET/reserv", new ReservAction());
        actions.put("POST/reserv", new SuccessReservAction());
        //actions.put("GET/reserv", new SuccessReservAction());
    }

    public static Action getAction(String method, String actionName) {
        return actions.get(method + "/" + actionName);
    }
}
