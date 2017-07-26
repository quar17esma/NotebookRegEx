package com.sergii.shutyi.Controller;

import com.sergii.shutyi.Model.Model;
import com.sergii.shutyi.View.View;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Processes user's actions.
     * Request modelUtil to pick a number to guess.
     * Checks and processes user's try if input is correct, and ask for another try if not.
     * Compare user's try with guessing number.
     * If try is right, request view to show result,
     * or changes the range and propose another try with showing previous attempts.
     */
    public void processUser() {
        InputUtil inputUtil = new InputUtil();
        inputUtil.inputAllData(view);
        model.createNote(inputUtil);

        System.out.println(model.getNote().toString());
    }
}
