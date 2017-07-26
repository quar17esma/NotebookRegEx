package com.sergii.shutyi.Controller;

import com.sergii.shutyi.View.TextConstants;
import com.sergii.shutyi.View.View;
import java.util.Scanner;

public class InputUtil {
    Scanner sc = new Scanner(System.in);

    private String lastName;
    private String firstName;
    private String middleName;

    private String nickName;
    private String commentary;
    private String group;

    private String phoneNumberHome;
    private String phoneNumberMobile;
    private String phoneNumberMobileAlt;
    private String email;
    private String skype;

    private String postIndex;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;


    public void inputAllData(View view){
        lastName = inputData(view, CheckPatterns.NAME, TextConstants.LAST_NAME).trim();
        firstName = inputData(view, CheckPatterns.NAME, TextConstants.FIRST_NAME);
        middleName = inputData(view, CheckPatterns.NAME, TextConstants.MIDDLE_NAME);

        nickName = inputData(view, CheckPatterns.NICKNAME, TextConstants.NICK_NAME);
        commentary = inputData(view, CheckPatterns.ANY, TextConstants.COMMENTARY);
        group = inputData(view, CheckPatterns.ANY, TextConstants.GROUP);

        phoneNumberHome = inputData(view, CheckPatterns.PHONE_NUMBER, TextConstants.PHONE_NUMBER_HOME);
        phoneNumberMobile = inputData(view, CheckPatterns.PHONE_NUMBER, TextConstants.PHONE_NUMBER_MOBILE);
        phoneNumberMobileAlt = inputData(view, CheckPatterns.PHONE_NUMBER, TextConstants.PHONE_NUMBER_MOBILE_ALT);

        email = inputData(view, CheckPatterns.EMAIL, TextConstants.EMAIL);
        skype = inputData(view, CheckPatterns.NICKNAME, TextConstants.SKYPE);

        postIndex = inputData(view, CheckPatterns.POST_INDEX, TextConstants.INDEX);
        city = inputData(view, CheckPatterns.NAME, TextConstants.CITY);
        street = inputData(view, CheckPatterns.NAME, TextConstants.STREET);
        houseNumber = inputData(view, CheckPatterns.NUMBER, TextConstants.HOUSE);
        apartmentNumber = inputData(view, CheckPatterns.NUMBER, TextConstants.APARTMENT);

    }

    public String inputData(View view, String pattern, String toInput) {
        view.printInvitation(toInput);

        while (true) {
            if (!sc.hasNext(pattern)) {
                view.printIncorrectInput(toInput);
                sc.next();
            } else {
                String inputted = sc.next(pattern);
                return inputted;
            }
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberMobile() {
        return phoneNumberMobile;
    }

    public void setPhoneNumberMobile(String phoneNumberMobile) {
        this.phoneNumberMobile = phoneNumberMobile;
    }

    public String getPhoneNumberMobileAlt() {
        return phoneNumberMobileAlt;
    }

    public void setPhoneNumberMobileAlt(String phoneNumberMobileAlt) {
        this.phoneNumberMobileAlt = phoneNumberMobileAlt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
