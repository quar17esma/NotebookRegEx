package com.sergii.shutyi.view;

import com.sergii.shutyi.model.enums.Group;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The {@code TextConstants} interface contains {@code String} constants for visualization by {@code view}.
 * @see View
 * @author S.Shutyi
 * Created on 26.07.2017.
 */
public interface TextConstants {

    Locale englishLocale = new Locale("en", "US");
    Locale russianLocale = new Locale("ru", "RU");

    ResourceBundle bundle = ResourceBundle.getBundle("Labels", englishLocale);

    String PLEASE_ENTER = bundle.getString("please.enter");
    String WRONG_INPUT = bundle.getString("wrong.input");
    String FIRST_NAME = bundle.getString("first.name");
    String LAST_NAME = bundle.getString("last.name");
    String MIDDLE_NAME = bundle.getString("middle.name");
    String NICK_NAME = bundle.getString("nick.name");
    String COMMENTARY = bundle.getString("commentary");
    String GROUP = bundle.getString("group")
            + Group.FAMILY + ", " + Group.FRIENDS + ", " + Group.WORK;
    String PHONE_NUMBER_HOME = bundle.getString("phone.number.home");
    String PHONE_NUMBER_MOBILE = bundle.getString("phone.number.mobile");
    String PHONE_NUMBER_MOBILE_ALT = bundle.getString("phone.number.mobile.alt");
    String EMAIL = bundle.getString("email");
    String SKYPE = bundle.getString("skype");
    String ADDRESS = bundle.getString("address");
    String INDEX = bundle.getString("post.index");
    String CITY = bundle.getString("city");
    String STREET = bundle.getString("street");
    String HOUSE = bundle.getString("house");
    String APARTMENT = bundle.getString("apartment");
    String DATE_NOTE_ADDED = bundle.getString("date.note.added");
    String DATE_NOTE_LAST_MODIFIED = bundle.getString("date.note.last.modified");
    String NICK_NAME_BUSY = bundle.getString("nick.name.busy");

    String HYPHEN = " - ";
    String DOT = ".";
    String SPACE = " ";
    String COMMA = ", ";
}
