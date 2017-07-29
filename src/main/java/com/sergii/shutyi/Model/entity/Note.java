package com.sergii.shutyi.Model.entity;

import com.sergii.shutyi.Model.Group;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class Note {

    private String lastName;
    private String firstName;
    private String middleName;
    private String lastNameInitials;
    private String nickName;
    private String commentary;
    private Group group;

    private String phoneNumberHome;
    private String phoneNumberMobile;
    private String phoneNumberMobileAlt;
    private String email;
    private String skype;

    private Address address;

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
                ", group=" + group +
                ", phoneNumberHome='" + phoneNumberHome + '\'' +
                ", phoneNumberMobile='" + phoneNumberMobile + '\'' +
                ", phoneNumberMobileAlt='" + phoneNumberMobileAlt + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", dateNoteAdded='" + dateNoteAdded + '\'' +
                ", dateNoteLastModified='" + dateNoteLastModified + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (getLastName() != null ? !getLastName().equals(note.getLastName()) : note.getLastName() != null)
            return false;
        if (getFirstName() != null ? !getFirstName().equals(note.getFirstName()) : note.getFirstName() != null)
            return false;
        if (getMiddleName() != null ? !getMiddleName().equals(note.getMiddleName()) : note.getMiddleName() != null)
            return false;
        if (getLastNameInitials() != null ? !getLastNameInitials().equals(note.getLastNameInitials()) : note.getLastNameInitials() != null)
            return false;
        if (getNickName() != null ? !getNickName().equals(note.getNickName()) : note.getNickName() != null)
            return false;
        if (getCommentary() != null ? !getCommentary().equals(note.getCommentary()) : note.getCommentary() != null)
            return false;
        if (getGroup() != note.getGroup()) return false;
        if (getPhoneNumberHome() != null ? !getPhoneNumberHome().equals(note.getPhoneNumberHome()) : note.getPhoneNumberHome() != null)
            return false;
        if (getPhoneNumberMobile() != null ? !getPhoneNumberMobile().equals(note.getPhoneNumberMobile()) : note.getPhoneNumberMobile() != null)
            return false;
        if (getPhoneNumberMobileAlt() != null ? !getPhoneNumberMobileAlt().equals(note.getPhoneNumberMobileAlt()) : note.getPhoneNumberMobileAlt() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(note.getEmail()) : note.getEmail() != null) return false;
        if (getSkype() != null ? !getSkype().equals(note.getSkype()) : note.getSkype() != null) return false;
        return address != null ? address.equals(note.address) : note.address == null;
    }

    @Override
    public int hashCode() {
        int result = getLastName() != null ? getLastName().hashCode() : 0;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getMiddleName() != null ? getMiddleName().hashCode() : 0);
        result = 31 * result + (getLastNameInitials() != null ? getLastNameInitials().hashCode() : 0);
        result = 31 * result + (getNickName() != null ? getNickName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getSkype() != null ? getSkype().hashCode() : 0);
        return result;
    }
}
