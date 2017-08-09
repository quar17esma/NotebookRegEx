package com.sergii.shutyi.model.notebuilder;

import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.model.entity.Address;
import com.sergii.shutyi.model.entity.Contacts;
import com.sergii.shutyi.model.entity.Note;
import com.sergii.shutyi.model.enums.Group;

import java.util.Date;
import java.util.Objects;

public class ConcreteNoteBuilder implements NoteBuilder {
    private static final String COMMA = ", ";
    private static final String DOT = ".";
    private static final String SPACE = " ";

    private Note note = new Note();

    @Override
    public Note getNote() {
        return note;
    }

    @Override
    public void buildFirstName(String firstName) {
        note.setFirstName(firstName);
    }

    @Override
    public void buildLastName(String lastName) {
        note.setLastName(lastName);
    }

    @Override
    public void buildMiddleName(String middleName) {
        note.setMiddleName(middleName);
    }

    @Override
    public void buildLastNameInitials(InputData inputData) {
        String lastNameInitials = inputData.getLastName() + SPACE + inputData.getFirstName().substring(0, 1) + DOT;
        note.setLastNameInitials(lastNameInitials);
    }

    @Override
    public void buildNickName(String nickName) {
        note.setNickName(nickName);
    }

    @Override
    public void buildCommentary(String commentary) {
        note.setCommentary(commentary);
    }

    @Override
    public void buildGroup(Group group) {
        note.setGroup(group);
    }

    @Override
    public void buildContacts(InputData inputData) {
        Contacts contacts = new Contacts();

        contacts.setPhoneNumberHome(inputData.getPhoneNumberHome());
        contacts.setPhoneNumberMobile(inputData.getPhoneNumberMobile());
        contacts.setPhoneNumberMobileAlt(inputData.getPhoneNumberMobileAlt());
        contacts.setEmail(inputData.getEmail());
        contacts.setSkype(inputData.getSkype());

        note.setContacts(contacts);
    }

    @Override
    public void buildAddress(InputData inputData) {
        Address address = new Address();

        address.setPostIndex(inputData.getPostIndex());
        address.setCity(inputData.getCity());
        address.setStreet(inputData.getStreet());
        address.setHouseNumber(inputData.getHouseNumber());
        address.setApartmentNumber(inputData.getApartmentNumber());
        address.setFullAddress(makeFullAddress(address));

        note.setAddress(address);
    }

    @Override
    public void buildDateNoteAdded(Date dateNoteAdded) {
        note.setDateNoteAdded(dateNoteAdded);
    }

    @Override
    public void buildDateNoteLastModified(Date dateNoteLastModified) {
        note.setDateNoteLastModified(dateNoteLastModified);
    }

    /**
     * Makes {@code String fullAddress} from parts.
     *
     * @param address object with parts of address.
     * @return new String with full address
     */
    private String makeFullAddress(Address address) {
        Objects.requireNonNull(address);

        String fullAddress = address.getPostIndex() + COMMA + address.getCity() + COMMA + address.getStreet()
                + COMMA + address.getHouseNumber() + COMMA + address.getApartmentNumber();

        return fullAddress;
    }
}
