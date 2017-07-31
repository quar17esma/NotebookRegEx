package com.sergii.shutyi.Exceptions;

import com.sergii.shutyi.Controller.InputDataUtil;

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
    private InputDataUtil inputData;

    /**
     * Constructs an {@code BusyNickNameException} with the specified
     * detail message and inputted data.
     * @param message
     * @param inputData
     */
    public BusyNickNameException(String message, InputDataUtil inputData) {
        super(message);
        this.inputData = inputData;
    }

    public InputDataUtil getInputData() {
        return inputData;
    }
}
