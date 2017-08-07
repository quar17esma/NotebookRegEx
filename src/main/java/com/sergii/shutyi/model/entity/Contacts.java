package com.sergii.shutyi.model.entity;

/**
 * Represents the contacts of the person in the note
 *
 * @author S.Shutyi
 * Created on 26.07.2017
 */
public class Contacts {

    /**
     * Home phone number
     */
    private String phoneNumberHome;
    /**
     * Mobile phone number
     */
    private String phoneNumberMobile;
    /**
     * Alternative mobile phone number
     */
    private String phoneNumberMobileAlt;
    /**
     * E-mail
     */
    private String email;
    /**
     * Skype login
     */
    private String skype;

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

    @Override
    public String toString() {
        return "Contacts{" +
                "phoneNumberHome='" + phoneNumberHome + '\'' +
                ", phoneNumberMobile='" + phoneNumberMobile + '\'' +
                ", phoneNumberMobileAlt='" + phoneNumberMobileAlt + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacts contacts = (Contacts) o;

        if (getPhoneNumberHome() != null ? !getPhoneNumberHome().equals(contacts.getPhoneNumberHome()) : contacts.getPhoneNumberHome() != null)
            return false;
        if (getPhoneNumberMobile() != null ? !getPhoneNumberMobile().equals(contacts.getPhoneNumberMobile()) : contacts.getPhoneNumberMobile() != null)
            return false;
        if (getPhoneNumberMobileAlt() != null ? !getPhoneNumberMobileAlt().equals(contacts.getPhoneNumberMobileAlt()) : contacts.getPhoneNumberMobileAlt() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(contacts.getEmail()) : contacts.getEmail() != null) return false;
        return getSkype() != null ? getSkype().equals(contacts.getSkype()) : contacts.getSkype() == null;
    }

    @Override
    public int hashCode() {
        int result = getPhoneNumberHome() != null ? getPhoneNumberHome().hashCode() : 0;
        result = 31 * result + (getPhoneNumberMobile() != null ? getPhoneNumberMobile().hashCode() : 0);
        result = 31 * result + (getPhoneNumberMobileAlt() != null ? getPhoneNumberMobileAlt().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getSkype() != null ? getSkype().hashCode() : 0);
        return result;
    }
}
