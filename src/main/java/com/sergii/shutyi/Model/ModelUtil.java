package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputDataUtil;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Contacts;
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
    public void setAllData(Note note, InputDataUtil inputData){

        note.setLastName(inputData.getLastName());
        note.setFirstName(inputData.getFirstName());
        note.setMiddleName(inputData.getMiddleName());

        note.setLastNameInitials(makeLastnameInitials(note));

        note.setNickName(inputData.getNickName());
        note.setCommentary(inputData.getCommentary());
        note.setGroup(inputData.getGroup());

        note.setContacts(makeContacts(inputData));

        note.setAddress(makeAddress(inputData));

        Date date = new Date();
        note.setDateNoteAdded(date.toString());
        note.setDateNoteLastModified(date.toString());
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

    private Contacts makeContacts(InputDataUtil inputDataUtil){
        Contacts contacts = new Contacts();

        contacts.setPhoneNumberHome(inputDataUtil.getPhoneNumberHome());
        contacts.setPhoneNumberMobile(inputDataUtil.getPhoneNumberMobile());
        contacts.setPhoneNumberMobileAlt(inputDataUtil.getPhoneNumberMobileAlt());
        contacts.setEmail(inputDataUtil.getEmail());
        contacts.setSkype(inputDataUtil.getSkype());

        return contacts;
    }

    private Address makeAddress(InputDataUtil inputDataUtil){
        Address address = new Address();

        address.setPostIndex(inputDataUtil.getPostIndex());
        address.setCity(inputDataUtil.getCity());
        address.setStreet(inputDataUtil.getStreet());
        address.setHouseNumber(inputDataUtil.getHouseNumber());
        address.setApartmentNumber(inputDataUtil.getApartmentNumber());
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
