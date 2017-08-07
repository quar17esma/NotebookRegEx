package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class ShowNotebookCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

//        request.setAttribute();

        page = ConfigurationManager.getProperty("path.page.show.notebook");
        return page;
    }
}
