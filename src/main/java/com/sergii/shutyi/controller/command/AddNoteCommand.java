package com.sergii.shutyi.controller.command;

import com.sergii.shutyi.controller.manager.ConfigurationManager;
import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.controller.InputDataUtilWeb;
import com.sergii.shutyi.exceptions.BusyNickNameException;
import com.sergii.shutyi.model.Model;
import javax.servlet.http.HttpServletRequest;

public class AddNoteCommand implements ActionCommand {
    Model model = new Model();

    @Override
    public String execute(HttpServletRequest request) {
//        request.setCharacterEncoding("UTF-8");
        String page = null;
        InputDataUtilWeb inputDataUtil = new InputDataUtilWeb();
        inputDataUtil.inputAllData(request);
        createNote(inputDataUtil.getInputData());

//        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/pages/showNotebook.jsp");
//        request.setAttribute("Notebook", model.getNotebook());
//        view.forward(request, response);

        //перейти на страницу "запись удачно добавлена" или ошибка
        page = ConfigurationManager.getProperty("path.page.add.note.success");
        return page;
    }

    public void createNote(InputData inputData){
        boolean isNoteCreated = false;
        while (!isNoteCreated) {
            try {
                isNoteCreated = model.createNote(inputData);
            } catch (BusyNickNameException e) {
//                inputData.changeNickName(view);
            }
        }
    }
}
