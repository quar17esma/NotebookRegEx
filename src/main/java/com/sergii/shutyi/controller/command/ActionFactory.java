package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.manager.MessageManager;
import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request){
        ActionCommand currentCommand = new EmptyCommand();

        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return currentCommand;
        }
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            currentCommand = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrong action", action + MessageManager.getProperty("message.wrongaction"));
        }
        return currentCommand;
    }
}
