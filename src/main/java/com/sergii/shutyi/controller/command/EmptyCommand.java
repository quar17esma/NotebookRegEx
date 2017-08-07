package com.sergii.shutyi.controllerr.command;

import com.sergii.shutyi.controllerr.manager.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.add.note");
        return  page;
    }
}
