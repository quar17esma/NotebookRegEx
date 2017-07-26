package com.sergii.shutyi.Model.entity;

/**
 *
 */
public class Note {

    private String lastName;
    private String firstName;
    private String middleName;
    private String lastNameInitials;
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
    private String fullAddress;

    private String dateNoteAdded;
    private String dateNoteLastModified;

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

    public String getLastNameInitials() {
        return lastNameInitials;
    }

    public void setLastNameInitials(String lastNameInitials) {
        this.lastNameInitials = lastNameInitials;
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

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getDateNoteAdded() {
        return dateNoteAdded;
    }

    public void setDateNoteAdded(String dateNoteAdded) {
        this.dateNoteAdded = dateNoteAdded;
    }

    public String getDateNoteLastModified() {
        return dateNoteLastModified;
    }

    public void setDateNoteLastModified(String dateNoteLastModified) {
        this.dateNoteLastModified = dateNoteLastModified;
    }

    @Override
    public String toString() {
        return "Note{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastNameInitials='" + lastNameInitials + '\'' +
                ", nickName='" + nickName + '\'' +
                ", commentary='" + commentary + '\'' +
                ", group='" + group + '\'' +
                ", phoneNumberHome='" + phoneNumberHome + '\'' +
                ", phoneNumberMobile='" + phoneNumberMobile + '\'' +
                ", phoneNumberMobileAlt='" + phoneNumberMobileAlt + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", postIndex='" + postIndex + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", dateNoteAdded='" + dateNoteAdded + '\'' +
                ", dateNoteLastModified='" + dateNoteLastModified + '\'' +
                '}';
    }
}
