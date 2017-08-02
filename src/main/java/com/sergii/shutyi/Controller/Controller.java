package com.sergii.shutyi.Controller;

import com.sergii.shutyi.Exceptions.BusyNickNameException;
import com.sergii.shutyi.Model.Model;
import com.sergii.shutyi.View.View;

/**
 * The {@code Controller} acts on both model and view.
 * <p>
 * It controls the data flow into model object and updates the view whenever data changes.
 * It keeps view and model separate.
 *
 * @author S.Shutyi
 * Created 26.07.2017.
 */
public class Controller {

    /**
     * Used for business logic
     */
    Model model;
    /**
     * Used for printing messages on console
     */
    View view;

    /**
     * Initializes a newly created {@code Controller}
     * @param model answering for the business logic
     * @param view answering for the visualization
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Processes user's actions.
     * <p>
     * Collects user's input, checks it and if correct .
     * Than prints {@code Notebook} to console.
     */
    public void processUser() {
        InputDataUtilConsole inputData = new InputDataUtilConsole();
        inputData.inputAllData(view);

        createNote(inputData);

        view.printNotebook(model);
    }

    /**
     * Creates {@code Note} and adds it to {@code Notebook}.
     * <p>
     * Trying to create {@code Note} from {@code InputDataUtilConsole}.
     * If all data is correct create {@code new Note}, otherwise ask user to correct data.
     * @param inputData contains data inputted by user
     */
    public void createNote(InputDataUtilConsole inputData){
        boolean isNoteCreated = false;
        while (!isNoteCreated) {
            try {
                isNoteCreated = model.createNote(inputData.getInputData());
            } catch (BusyNickNameException e) {
                inputData.changeNickName(view);
            }
        }
    }
}
