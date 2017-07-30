package com.sergii.shutyi.Exceptions;

import com.sergii.shutyi.Controller.InputDataUtil;

public class BusyLoginException extends Exception {
    private InputDataUtil inputDataUtil;

    public BusyLoginException(String message, InputDataUtil inputDataUtil) {
        super(message);
        this.inputDataUtil = inputDataUtil;
    }

    public InputDataUtil getInputDataUtil() {
        return inputDataUtil;
    }
}
