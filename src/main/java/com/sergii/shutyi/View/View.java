package com.sergii.shutyi.View;

import com.sergii.shutyi.Model.Model;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.Model.entity.Notebook;

import java.util.ArrayList;

import static com.sergii.shutyi.View.TextConstants.*;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class View {

    /**
     * Print invitation to input data.
     * @param toInput indicates what to input
     */
    public void printInvitation(String toInput){
        printMessage(PLEASE_ENTER + toInput);
    }

    /**
     * Prints error and new invitation
     * @param toInput indicates what to input
     */
    public void printIncorrectInput(String toInput){
        printMessage(WRONG_INPUT);
        printInvitation(toInput);
    }

    /** Prints Note to console.
     * @param model to get Note from
     */
    public void printNotebook(Model model){
        ArrayList<Note> notesList = model.getNotebook().getNotesList();
        for (Note note:notesList) {
            printMessage(note.toString());
        }
    }

    /**
     * Prints message to commandline
     * @param message message to print
     */
    public void printMessage(String message){
        System.out.println(message);
    }
}
