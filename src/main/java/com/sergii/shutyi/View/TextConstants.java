package com.sergii.shutyi.View;

import com.sergii.shutyi.Model.enums.Group;

/**
 * The {@code TextConstants} interface contains {@code String} constants for visualization by {@code View}.
 * @see View
 * @author S.Shutyi
 * Created on 26.07.2017.
 */
public interface TextConstants {

    String PLEASE_ENTER = "Please, enter ";
    String WRONG_INPUT = "Incorrect input! ";
    String FIRST_NAME = "First name";
    String LAST_NAME = "Last name";
    String MIDDLE_NAME = "Middle name";
    String NICK_NAME = "Nick name";
    String COMMENTARY = "Commentary";
    String GROUP = "Group. Choose one of options: "
            + Group.FAMILY + ", " + Group.FRIENDS + ", " + Group.WORK;
    String PHONE_NUMBER_HOME = "home phone number";
    String PHONE_NUMBER_MOBILE = "mobile phone number";
    String PHONE_NUMBER_MOBILE_ALT = "alternative mobile phone number";
    String EMAIL = "email";
    String SKYPE = "skype";
    String ADDRESS = "address";
    String INDEX = "post index";
    String CITY = "city";
    String STREET = "street";
    String HOUSE = "house number";
    String APARTMENT = "apartment number";
    String DATE_NOTE_ADDED = "Note was added: ";
    String DATE_NOTE_LAST_MODIFIED = "Note was last modified: ";
    String LOGIN_BUSY = "another login. The current login you are trying to enter is already busy.";

    String HYPHEN = " - ";
    String DOT = ".";
    String SPACE = " ";
    String COMMA = ", ";
}
