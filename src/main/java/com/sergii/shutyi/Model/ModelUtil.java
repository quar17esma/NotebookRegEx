package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputData;
import com.sergii.shutyi.Controller.InputDataUtilConsole;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Contacts;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.View.TextConstants;

import java.util.Date;


/**
 * The {@code ModelUtil} class used for filling {@code Note} by data.
 *
 * @author S.Shutyi
 * @see Note
 * Created on 26.07.2017.
 */
public class ModelUtil {

    /**
     * Fills all {@code Note} fields with inputted and created data.
     *
     * @param note      note to fill
     * @param inputData contains inputted data
     */
    public void setAllData(Note note, InputData inputData) {

        note.setLastName(inputData.getLastName());
        note.setFirstName(inputData.getFirstName());
        note.setMiddleName(inputData.getMiddleName());
        note.setLastNameInitials(makeLastNameInitials(note));
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
     *
     * @param note note with last name and first name
     * @return {@code new String} with last name and initial
     */
    private String makeLastNameInitials(Note note) {
        String lastNameInitials = note.getLastName() + TextConstants.SPACE
                + note.getFirstName().substring(0, 1) + TextConstants.DOT;
        return lastNameInitials;
    }

    /**
     * Creates {@code new Contacts} object from inputted data.
     * @param inputData contains inputted data
     * @return {@code new Contacts} object
     */
    private Contacts makeContacts(InputData inputData) {
        Contacts contacts = new Contacts();

        contacts.setPhoneNumberHome(inputData.getPhoneNumberHome());
        contacts.setPhoneNumberMobile(inputData.getPhoneNumberMobile());
        contacts.setPhoneNumberMobileAlt(inputData.getPhoneNumberMobileAlt());
        contacts.setEmail(inputData.getEmail());
        contacts.setSkype(inputData.getSkype());

        return contacts;
    }

    /**
     * Creates {@code new Address} object from inputted data.
     * @param inputData contains inputted data
     * @return {@code new Contacts} object
     */
    private Address makeAddress(InputData inputData) {
        Address address = new Address();

        address.setPostIndex(inputData.getPostIndex());
        address.setCity(inputData.getCity());
        address.setStreet(inputData.getStreet());
        address.setHouseNumber(inputData.getHouseNumber());
        address.setApartmentNumber(inputData.getApartmentNumber());
        address.setFullAddress(makeFullAddress(address));

        return address;
    }

    /**
     * Makes {@code String fullAddress} from parts.
     *
     * @param address object with parts of address.
     * @return new String with full address
     */
    private String makeFullAddress(Address address) {
            String fullAddress = address.getPostIndex() + TextConstants.COMMA
                    + address.getCity() + TextConstants.COMMA + address.getStreet() + TextConstants.COMMA
                    + address.getHouseNumber() + TextConstants.COMMA + address.getApartmentNumber();
            return fullAddress;
    }
}
