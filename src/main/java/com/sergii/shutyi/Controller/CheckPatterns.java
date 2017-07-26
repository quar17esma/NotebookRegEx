package com.sergii.shutyi.Controller;


/**
 * Created by S.Shutyi on 26.07.2017.
 */
public interface CheckPatterns {
    String NAME = "[A-Z][a-z]+";
    String EMAIL = "[a-zA-Z1-9\\-\\._]+@[a-z1-9]+(.[a-z1-9]+){1,}";
    String NICKNAME = "[a-zA-Z0-9_.-]{3,}";
    String ANY = ".*";
    String PHONE_NUMBER = "\\+?\\d+([\\(\\s\\-]?\\d+[\\)\\s\\-]?[\\d\\s\\-]+)?";
    String POST_INDEX = "[0-9]{5}";
    String NUMBER = "[0-9]{1,5}[a-z]?";
}
