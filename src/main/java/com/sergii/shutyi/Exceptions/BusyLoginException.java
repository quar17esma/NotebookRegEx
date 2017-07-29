package com.sergii.shutyi.Exceptions;

import com.sergii.shutyi.Controller.InputUtil;

public class BusyLoginException extends Exception {
    private InputUtil inputUtil;

    public BusyLoginException(String message, InputUtil inputUtil) {
        super(message);
        this.inputUtil = inputUtil;
    }

    public InputUtil getInputUtil() {
        return inputUtil;
    }
}
