package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Command for inputting data for new Note.
 */
public class InputNoteCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        page = ConfigurationManager.getProperty("path.page.add.note");
        return page;
    }
}
