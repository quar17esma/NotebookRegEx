package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.View.TextConstants;
import java.util.Date;


/**
 * Created by S.Shutyi on 26.07.2017.
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

        note.setAddress(makeAddress(inputData));

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

    private Address makeAddress(InputUtil inputUtil){
        Address address = new Address();

        address.setPostIndex(inputUtil.getPostIndex());
        address.setCity(inputUtil.getCity());
        address.setStreet(inputUtil.getStreet());
        address.setHouseNumber(inputUtil.getHouseNumber());
        address.setApartmentNumber(inputUtil.getApartmentNumber());
        address.setFullAddress(makeFullAddress(address));

        return address;
    }

    /**
     * Makes fullAddress String from parts.
     * @param note note with parts of address
     * @return new String with full address
     */
    private String makeFullAddress(Address address){
        String fullAddress = address.getPostIndex() + TextConstants.COMMA
                + address.getCity() + TextConstants.COMMA + address.getStreet() + TextConstants.COMMA
                + address.getHouseNumber() + TextConstants.COMMA + address.getApartmentNumber();
        return fullAddress;
    }
}
