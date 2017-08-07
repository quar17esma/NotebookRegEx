package com.sergii.shutyi.controller.manager;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageManager {
    public static final ResourceBundle resourceBundle =
            ResourceBundle.getBundle("Labels", new Locale("en_US"));

    private MessageManager(){}

    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}
