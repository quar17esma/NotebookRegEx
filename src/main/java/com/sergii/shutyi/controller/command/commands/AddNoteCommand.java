package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.InputDataChecker;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.controller.InputDataUtilWeb;
import com.sergii.shutyi.controller.manager.MessageManager;
import com.sergii.shutyi.exceptions.BusyNickNameException;
import javax.servlet.http.HttpServletRequest;

/**
 * Command for creating and adding new Note to Notebook.
 *
 * @author S.Shutyi
 */
public class AddNoteCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        InputDataUtilWeb inputDataUtil = new InputDataUtilWeb();
        inputDataUtil.inputAllData(request);

        if (!isInputDataCorrect(inputDataUtil.getInputData())) {
            request.setAttribute("inputData", inputDataUtil.getInputData());
            page = ConfigurationManager.getProperty("path.page.add.note");
            return page;
        }

        try {
            createNote(inputDataUtil.getInputData());
            page = ConfigurationManager.getProperty("path.page.add.note.success");
        } catch (BusyNickNameException e) {
            request.setAttribute("inputData", inputDataUtil.getInputData());
            request.setAttribute("errorBusyNickName", MessageManager.getProperty("error.busy.nickname"));
            page = ConfigurationManager.getProperty("path.page.add.note");
        }

        return page;
    }

    /**
     * Creates new Note from inputted Data and adds it to Notebook.
     * @param inputData
     * @throws BusyNickNameException
     */
    private void createNote(InputData inputData) throws BusyNickNameException {
        Controller.getModel().createNote(inputData);
    }

    /**
     * Check is inputData correct.
     * @param inputData data to check
     * @return true if all data correct.
     */
    private boolean isInputDataCorrect(InputData inputData){
        InputDataChecker checker = new InputDataChecker();

        return checker.isInputDataCorrect(inputData);
    }
}
