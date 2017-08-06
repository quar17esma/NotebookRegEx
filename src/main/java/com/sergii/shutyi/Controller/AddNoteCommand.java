package com.sergii.shutyi.Controller;

import com.sergii.shutyi.Exceptions.BusyNickNameException;
import com.sergii.shutyi.Model.Model;

import javax.servlet.RequestDispatcher;
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
        page = ConfigurationManager.getProperty("path.page.show.notebook");
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
