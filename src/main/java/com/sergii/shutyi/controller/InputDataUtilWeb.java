package com.sergii.shutyi.controller;

import com.sergii.shutyi.model.enums.Group;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class InputDataUtilWeb {

    //Fields store inputted data
    InputData inputData = new InputData();

    /**
     * Collects data from input.
     * <p>
     * Trims all Strings.
     */
    public void inputAllData(HttpServletRequest request) {
        inputData.setLastName(request.getParameter("lastName").trim());
        inputData.setFirstName(request.getParameter("firstName").trim());
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

    /**
     * Returns Group type for given name.
     * @param group {@code String} name of group
     * @throws IllegalArgumentException if there is no Group type for such group name.
     * @return {@code Group} type for such group name.
     */
    private Group inputGroup(String group) {
        Objects.requireNonNull(group);
        Group inputGroup = Group.valueOf(group.toUpperCase());
        switch (inputGroup) {
            case FRIENDS:
                return Group.FRIENDS;
            case FAMILY:
                return Group.FAMILY;
            case WORK:
                return Group.WORK;
            default:
                throw new IllegalArgumentException("Unsupported group " + group);
        }
    }

    //getters and setters
    public InputData getInputData() {
        return inputData;
    }

    public void setInputData(InputData inputData) {
        this.inputData = Objects.requireNonNull(inputData);
    }
}
