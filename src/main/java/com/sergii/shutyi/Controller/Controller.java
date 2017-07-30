package com.sergii.shutyi.Controller;

import com.sergii.shutyi.Exceptions.BusyLoginException;
import com.sergii.shutyi.Model.Model;
import com.sergii.shutyi.View.TextConstants;
import com.sergii.shutyi.View.View;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Processes user's actions.
     * Collects user's input, checks it and if correct puts it to entity Note.
     * Than prints Note to console.
     */
    public void processUser() {
        InputDataUtil inputData = new InputDataUtil();
        inputData.inputAllData(view);

        createNote(view, inputData);

        view.printNotebook(model);
    }

    public void createNote(View view, InputDataUtil inputData){
        boolean isNoteCreated = false;
        while (!isNoteCreated) {
            try {
                isNoteCreated = model.createNote(inputData);
            } catch (BusyLoginException e) {
                inputData.changeNickName(view);
            }
        }
    }
}
