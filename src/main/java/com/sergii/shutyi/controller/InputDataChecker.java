package com.sergii.shutyi.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class for checking inputted data on correctness.
 *
 * @author S.Shutyi
 * Created on 10.08.2017.
 */
public class InputDataChecker {
    /**
     * Map collects pairs: String with inputted data, and value - is it correct.
     */
    private Map<String, Boolean> correctDataMap = new HashMap<>();

    /**
     * Checks is all inputted data correct.
     * @param inputData
     * @return {@code true} if all inputted data is correct, else return false
     */
    public boolean isInputDataCorrect(InputData inputData) {
        matcher(CheckPatterns.NAME, inputData.getFirstName());
        matcher(CheckPatterns.NAME, inputData.getLastName());
        matcher(CheckPatterns.NAME, inputData.getMiddleName());
        matcher(CheckPatterns.NICKNAME, inputData.getNickName());
        matcher(CheckPatterns.ANY, inputData.getCommentary());
        matcher(CheckPatterns.PHONE_NUMBER, inputData.getPhoneNumberHome());
        matcher(CheckPatterns.PHONE_NUMBER, inputData.getPhoneNumberMobile());
        matcher(CheckPatterns.PHONE_NUMBER, inputData.getPhoneNumberMobileAlt());
        matcher(CheckPatterns.EMAIL, inputData.getEmail());
        matcher(CheckPatterns.NICKNAME, inputData.getSkype());
        matcher(CheckPatterns.POST_INDEX, inputData.getPostIndex());
        matcher(CheckPatterns.NAME, inputData.getCity());
        matcher(CheckPatterns.NAME, inputData.getStreet());
        matcher(CheckPatterns.NUMBER, inputData.getHouseNumber());
        matcher(CheckPatterns.NUMBER, inputData.getApartmentNumber());

        if (correctDataMap.values().contains(false)) {
            return false;
        }

        return true;
    }

    /**
     * Check if pattern matches string and saves results to map.
     * @param pattern
     * @param string
     */
    private void matcher(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        Boolean match = matcher.matches();
        correctDataMap.put(string, match);
    }
}
