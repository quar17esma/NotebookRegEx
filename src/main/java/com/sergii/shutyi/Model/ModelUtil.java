package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.View.TextConstants;
import java.util.Date;


/**
 * 
 */
public class ModelUtil {

    /**
     * Fills all note fields with inputted and created data.
     * @param note note to fill
     * @param inputData inputted data
     */
    public void setAllData(Note note, InputUtil inputData){

        note.setLastName(inputData.getLastName());
        note.setFirstName(inputData.getFirstName());
        note.setMiddleName(inputData.getMiddleName());

        note.setLastNameInitials(makeLastnameInitials(note));

        note.setNickName(inputData.getNickName());
        note.setCommentary(inputData.getCommentary());
        note.setGroup(inputData.getGroup());

        note.setPhoneNumberHome(inputData.getPhoneNumberHome());
        note.setPhoneNumberMobile(inputData.getPhoneNumberMobile());
        note.setPhoneNumberMobileAlt(inputData.getPhoneNumberMobileAlt());
        note.setEmail(inputData.getEmail());
        note.setSkype(inputData.getSkype());
        note.setPostIndex(inputData.getPostIndex());
        note.setCity(inputData.getCity());
        note.setStreet(inputData.getStreet());
        note.setHouseNumber(inputData.getHouseNumber());
        note.setApartmentNumber(inputData.getApartmentNumber());

        note.setFullAddress(makeFullAddress(note));

        note.setDateNoteAdded(new Date().toString());
        note.setDateNoteLastModified(new Date().toString());
    }

    /**
     * Makes last name String with first name initial
     * @param note note with last name and first name
     * @return new String with last name and initial
     */
    private String makeLastnameInitials(Note note){
        String lastNameInitials = note.getLastName() + TextConstants.SPACE
                + note.getFirstName().substring(0,1) + TextConstants.DOT;
        return lastNameInitials;
    }

    /**
     * Makes fullAddress String from parts.
     * @param note note with parts of address
     * @return new String with full address
     */
    private String makeFullAddress(Note note){
        String fullAddress = note.getPostIndex() + TextConstants.COMMA
                + note.getCity() + TextConstants.COMMA + note.getStreet() + TextConstants.COMMA
                + note.getHouseNumber() + TextConstants.COMMA + note.getApartmentNumber();
        return fullAddress;
    }
}
