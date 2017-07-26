package com.sergii.shutyi.View;

import static com.sergii.shutyi.View.TextConstants.*;

public class View {

    /**
     * Prints invitation and current range of numbers
     */
    public void printInvitation(String toInput){
        printMessage(PLEASE_ENTER + toInput);
    }

    /**
     * Prints error and new invitation
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
