package com.sergii.shutyi.controller.command.commands;

import com.sergii.shutyi.controller.Controller;
import com.sergii.shutyi.controller.command.ActionCommand;
import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.controller.InputDataUtilWeb;
import com.sergii.shutyi.exceptions.BusyNickNameException;
import javax.servlet.http.HttpServletRequest;

public class AddNoteCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
//        request.setCharacterEncoding("UTF-8");
        String page = null;

        InputDataUtilWeb inputDataUtil = new InputDataUtilWeb();
        inputDataUtil.inputAllData(request);
        createNote(inputDataUtil.getInputData());



        //перейти на страницу "запись удачно добавлена" или ошибка
        page = ConfigurationManager.getProperty("path.page.add.note.success");
        return page;
    }

    public void createNote(InputData inputData){
        boolean isNoteCreated = false;
        while (!isNoteCreated) {
            try {
                isNoteCreated = Controller.getModel().createNote(inputData);
            } catch (BusyNickNameException e) {
//                inputData.changeNickName(view);
            }
        }
    }
}
