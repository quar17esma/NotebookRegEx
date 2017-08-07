package com.sergii.shutyi.exceptionss;

import com.sergii.shutyi.controllerr.InputData;

/**
 * Thrown when trying to add {@code Note} to {@code Notebook} with nickName that already busy.
 *
 * @author S.Shutyi
 * Created on 29.07.2017
 */
public class BusyNickNameException extends Exception {
    /**
     * Contains inputted data
     */
    private InputData inputData;

    /**
     * Constructs an {@code BusyNickNameException} with the specified
     * detail message and inputted data.
     * @param message
     * @param inputData
     */
    public BusyNickNameException(String message, InputData inputData) {
        super(message);
        this.inputData = inputData;
    }

    public InputData getInputData() {
        return inputData;
    }
}
