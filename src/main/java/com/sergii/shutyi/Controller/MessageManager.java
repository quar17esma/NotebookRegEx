package com.sergii.shutyi.Controller;

import java.util.ResourceBundle;

public class MessageManager {
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.messages");

    private MessageManager(){}

    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}
