package com.epam.vo.webtickets.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private static Map<String, Action> actions = new HashMap<>();

    static {
//        actions.put("GET/", new RegisterFormAction());
        actions.put("GET/register", new RegisterFormAction());
        actions.put("POST/register", new RegisterAction());
//        TODO create successRegister
//        actions.put("GET/successRegister", new SuccessRegisterAction());
    }

    public static Action getAction(String method, String actionName) {
        return actions.get(method + "/" + actionName);
    }
}
