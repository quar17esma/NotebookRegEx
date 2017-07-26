package com.sergii.shutyi.Controller;

import com.sergii.shutyi.Model.Model;
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
        InputUtil inputUtil = new InputUtil();
        inputUtil.inputAllData(view);
        model.createNote(inputUtil);

        System.out.println(model.getNote().toString());
    }
}
