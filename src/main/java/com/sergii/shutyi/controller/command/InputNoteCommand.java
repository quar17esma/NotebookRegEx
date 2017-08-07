package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class InputNoteCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        page = ConfigurationManager.getProperty("path.page.add.note");
        return page;
    }
}
