package com.sergii.shutyi.View;

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

    /**
     * Prints message to commandline
     * @param message message to print
     */
    private void printMessage(String message){
        System.out.println(message);
    }
}
