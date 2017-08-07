package com.sergii.shutyi.controllerr;

import com.sergii.shutyi.exceptionss.BusyNickNameException;
import com.sergii.shutyi.modell.Model;
import com.sergii.shutyi.vieww.View;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="AddNoteController", urlPatterns="/AddNoteController.do")
public class AddNoteController extends HttpServlet {

    private static final long serialVersionUID = 102831973239L;

    public static final String LIST_GUEST = "/showNotebook.jsp";

    Model model = new Model();
    View view = new View();


    public AddNoteController() {
    }

    public void createNote(InputData inputData){
        boolean isNoteCreated = false;
        while (!isNoteCreated) {
            try {
                isNoteCreated = model.createNote(inputData);
            } catch (BusyNickNameException e) {
//                inputData.changeNickName(vieww);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        InputDataUtilWeb inputDataUtil = new InputDataUtilWeb();
        inputDataUtil.inputAllData(request);

        createNote(inputDataUtil.getInputData());
        view.printNotebook(model);

        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/pages/showNotebook.jsp");
        request.setAttribute("Notebook", model.getNotebook());
        view.forward(request, response);
    }
}
