package com.sergii.shutyi.Model.entity;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Exceptions.BusyLoginException;
import com.sergii.shutyi.Model.enums.Group;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotebookTest {
    @Test(expected = BusyLoginException.class)
    public void addNote() throws Exception {
        Notebook notebook = new Notebook();

        Note note = new Note();
        note.setLastName("John");
        note.setFirstName("Smith");
        note.setMiddleName("Arnold");
        note.setLastNameInitials("John S.");
        note.setNickName("syllas");
        note.setCommentary("Test Note");
        note.setGroup(Group.FAMILY);

        Contacts contacts = new Contacts();
        contacts.setPhoneNumberHome("0444404545");
        contacts.setPhoneNumberMobile("0968887979");
        contacts.setPhoneNumberMobileAlt("0968887878");
        contacts.setEmail("john@gmail.com");
        contacts.setSkype("john");
        note.setContacts(contacts);

        Address address = new Address();
        address.setPostIndex("02105");
        address.setCity("Kiev");
        address.setStreet("Tampere");
        address.setHouseNumber("88");
        address.setApartmentNumber("44");
        address.setFullAddress("02105, Kiev, Tampere, 88, 44");
        note.setAddress(address);

        notebook.addNote(note, new InputUtil());

        Note newNote = new Note();
        newNote.setLastName("Micky");
        newNote.setFirstName("Mouse");
        newNote.setMiddleName("Jordan");
        newNote.setLastNameInitials("Micky M.");
        newNote.setNickName("syllas");
        newNote.setCommentary("Test Note number 2");
        newNote.setGroup(Group.FRIENDS);

        Contacts newContacts = new Contacts();
        newContacts.setPhoneNumberHome("0444405050");
        newContacts.setPhoneNumberMobile("0968888080");
        newContacts.setPhoneNumberMobileAlt("0968888181");
        newContacts.setEmail("micky@gmail.com");
        newContacts.setSkype("micky");
        note.setContacts(newContacts);

        Address newAddress = new Address();
        newAddress.setPostIndex("02103");
        newAddress.setCity("Lviv");
        newAddress.setStreet("Teligy");
        newAddress.setHouseNumber("66");
        newAddress.setApartmentNumber("33");
        newAddress.setFullAddress("02103, Lviv, Teligy, 66, 33");
        note.setAddress(newAddress);

        notebook.addNote(newNote, new InputUtil());
    }

}