package com.sergii.shutyi.controller;

import com.sergii.shutyi.model.enums.Group;
import com.sergii.shutyi.view.View;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class InputDataUtilWeb {

    //Fields store inputted data
    InputData inputData = new InputData();

    /**
     * Collects data from input.
     * <p>
     * Trims all Strings.
     *
     */
    public void inputAllData(HttpServletRequest request) {
        inputData.setLastName(request.getParameter("firstName").trim());
        inputData.setFirstName(request.getParameter("lastName").trim());
        inputData.setMiddleName(request.getParameter("middleName").trim());
        inputData.setNickName(request.getParameter("nickName").trim());
        inputData.setCommentary(request.getParameter("commentary").trim());
        inputData.setGroup(inputGroup(request.getParameter("group")));

        inputData.setPhoneNumberHome(request.getParameter("homePhoneNumber").trim());
        inputData.setPhoneNumberMobile(request.getParameter("mobilePhoneNumber").trim());
        inputData.setPhoneNumberMobileAlt(request.getParameter("mobilePhoneNumberAlt").trim());
        inputData.setEmail(request.getParameter("email").trim());
        inputData.setSkype(request.getParameter("skype").trim());

        inputData.setPostIndex(request.getParameter("postIndex").trim());
        inputData.setCity(request.getParameter("city").trim());
        inputData.setStreet(request.getParameter("street").trim());
        inputData.setHouseNumber(request.getParameter("houseNumber").trim());
        inputData.setApartmentNumber(request.getParameter("apartmentNumber").trim());
    }

    private Group inputGroup(String group) {
        Objects.requireNonNull(group);
        switch (group) {
            case "FRIENDS":
                return Group.FRIENDS;
            case "FAMILY":
                return Group.FAMILY;
            case "WORK":
                return Group.WORK;
            default:
                throw new IllegalArgumentException("Unsupported group " + group);
        }
    }

    /**
     * Changes inputted {@code nickName} for another inputted from console.
     * <p>
     * Used if {@code Note} with inputted {@code nickName} already exists in {@code Notebook}.
     *
     * @param view to print messages.
     */
    public void changeNickName(View view) {
//        setNickName(inputData(view, CheckPatterns.NICKNAME, TextConstants.NICK_NAME_BUSY).trim());
    }

    //getters and setters
    public InputData getInputData() {
        return inputData;
    }

    public void setInputData(InputData inputData) {
        this.inputData = Objects.requireNonNull(inputData);
    }
}
