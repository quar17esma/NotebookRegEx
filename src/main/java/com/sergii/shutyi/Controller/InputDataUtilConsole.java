package com.sergii.shutyi.Controller;

import com.sergii.shutyi.Model.enums.Group;
import com.sergii.shutyi.View.TextConstants;
import com.sergii.shutyi.View.View;
import java.util.Scanner;

/**
 * The {@code InputDataUtilConsole} class used for inputting data from console and collecting it.
 *
 * @author S.Shutyi
 * Created on 26.07.2017.
 */
public class InputDataUtilConsole {

    /**
     * {@code Scanner} to input data from console
     */
    Scanner scanner = new Scanner(System.in);

    //Fields store inputted data
    private InputData inputData;

    /**
     * Collects data from input.
     * <p>
     * Trims all Strings.
     * @param view to print messages
     */
    public void inputAllData(View view){
        inputData.setLastName(inputData(view, CheckPatterns.NAME, TextConstants.LAST_NAME).trim());
        inputData.setFirstName(inputData(view, CheckPatterns.NAME, TextConstants.FIRST_NAME).trim());
        inputData.setMiddleName(inputData(view, CheckPatterns.NAME, TextConstants.MIDDLE_NAME).trim());

        inputData.setNickName(inputData(view, CheckPatterns.NICKNAME, TextConstants.NICK_NAME).trim());
        inputData.setCommentary(inputLine(view, CheckPatterns.ANY, TextConstants.COMMENTARY).trim());
        inputData.setGroup(inputGroup(view, TextConstants.GROUP));

        inputData.setPhoneNumberHome(inputData(view, CheckPatterns.PHONE_NUMBER, TextConstants.PHONE_NUMBER_HOME).trim());
        inputData.setPhoneNumberMobile(inputData(view, CheckPatterns.PHONE_NUMBER, TextConstants.PHONE_NUMBER_MOBILE).trim());
        inputData.setPhoneNumberMobileAlt(inputData(view, CheckPatterns.PHONE_NUMBER, TextConstants.PHONE_NUMBER_MOBILE_ALT).trim());
        inputData.setEmail(inputData(view, CheckPatterns.EMAIL, TextConstants.EMAIL).trim());
        inputData.setSkype(inputData(view, CheckPatterns.NICKNAME, TextConstants.SKYPE).trim());

        inputData.setPostIndex(inputData(view, CheckPatterns.POST_INDEX, TextConstants.INDEX).trim());
        inputData.setPostIndex(inputData(view, CheckPatterns.NAME, TextConstants.CITY).trim());
        inputData.setStreet(inputData(view, CheckPatterns.NAME, TextConstants.STREET).trim());
        inputData.setHouseNumber(inputData(view, CheckPatterns.NUMBER, TextConstants.HOUSE).trim());
        inputData.setApartmentNumber(inputData(view, CheckPatterns.NUMBER, TextConstants.APARTMENT).trim());
    }

    /**
     * Takes input from console and trims all after space.
     * @param view to print messages
     * @param pattern to check input
     * @param toInput String added to invitation, shows what is currently inputting
     * @return correct inputted string
     */
    public String inputData(View view, String pattern, String toInput) {
        view.printInvitation(toInput);

        while (true) {
            if (!scanner.hasNext(pattern)) {
                view.printIncorrectInput(toInput);
                scanner.next();
            } else {
                String inputted = scanner.next(pattern);
                scanner.nextLine();
                return inputted;
            }
        }
    }

    /**
     * Takes inputted line from console.
     * @param view to print messages
     * @param pattern to check input
     * @param toInput {@code String} added to invitation, shows what is currently inputting
     * @return correct inputted line
     */
    public String inputLine(View view, String pattern, String toInput){
        view.printInvitation(toInput);

        while (true) {
            if (!scanner.hasNext(pattern)) {
                view.printIncorrectInput(toInput);
                scanner.next();
            } else {
                return scanner.nextLine();
            }
        }
    }

    /**
     * Takes inputted {@code Group} type from console.
     * @param view to print messages
     * @param toInput {@code String} added to invitation, shows what is currently inputting
     * @return correct inputted {@code Group} type.
     */
    public Group inputGroup(View view, String toInput){
        view.printInvitation(toInput);

        while (true) {
            if (!scanner.hasNext(Group.FRIENDS.toString())&&
                    !scanner.hasNext(Group.FAMILY.toString())&&
                    !scanner.hasNext(Group.WORK.toString())){
                view.printIncorrectInput(toInput);
                scanner.next();
            } else {
                return Group.valueOf(scanner.next().toUpperCase());
            }
        }
    }

    /**
     * Changes inputted {@code nickName} for another inputted from console.
     * <p>
     * Used if {@code Note} with inputted {@code nickName} already exists in {@code Notebook}.
     * @param view to print messages.
     */
    public void changeNickName(View view){
        inputData.setNickName(inputData(view, CheckPatterns.NICKNAME, TextConstants.NICK_NAME_BUSY).trim());
    }

    //getters and setters

    public InputData getInputData() {
        return inputData;
    }

    public void setInputData(InputData inputData) {
        this.inputData = inputData;
    }


//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    public String getCommentary() {
//        return commentary;
//    }
//
//    public void setCommentary(String commentary) {
//        this.commentary = commentary;
//    }
//
//    public Group getGroup() {
//        return group;
//    }
//
//    public void setGroup(Group group) {
//        this.group = group;
//    }
//
//    public String getPhoneNumberHome() {
//        return phoneNumberHome;
//    }
//
//    public void setPhoneNumberHome(String phoneNumberHome) {
//        this.phoneNumberHome = phoneNumberHome;
//    }
//
//    public String getPhoneNumberMobile() {
//        return phoneNumberMobile;
//    }
//
//    public void setPhoneNumberMobile(String phoneNumberMobile) {
//        this.phoneNumberMobile = phoneNumberMobile;
//    }
//
//    public String getPhoneNumberMobileAlt() {
//        return phoneNumberMobileAlt;
//    }
//
//    public void setPhoneNumberMobileAlt(String phoneNumberMobileAlt) {
//        this.phoneNumberMobileAlt = phoneNumberMobileAlt;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSkype() {
//        return skype;
//    }
//
//    public void setSkype(String skype) {
//        this.skype = skype;
//    }
//
//    public String getPostIndex() {
//        return postIndex;
//    }
//
//    public void setPostIndex(String postIndex) {
//        this.postIndex = postIndex;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getHouseNumber() {
//        return houseNumber;
//    }
//
//    public void setHouseNumber(String houseNumber) {
//        this.houseNumber = houseNumber;
//    }
//
//    public String getApartmentNumber() {
//        return apartmentNumber;
//    }
//
//    public void setApartmentNumber(String apartmentNumber) {
//        this.apartmentNumber = apartmentNumber;
//    }
}
