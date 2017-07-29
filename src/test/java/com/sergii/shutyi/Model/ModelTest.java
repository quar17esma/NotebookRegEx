package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Contacts;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.Model.entity.Notebook;
import com.sergii.shutyi.Model.enums.Group;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void createNote() throws Exception {
        Notebook notebookExpected = new Notebook();

        Note noteExpectedOne = new Note();
        noteExpectedOne.setLastName("John");
        noteExpectedOne.setFirstName("Smith");
        noteExpectedOne.setMiddleName("Arnold");
        noteExpectedOne.setLastNameInitials("John S.");
        noteExpectedOne.setNickName("syllas");
        noteExpectedOne.setCommentary("Test Note");
        noteExpectedOne.setGroup(Group.FAMILY);

        Contacts contactsExpectedOne = new Contacts();
        contactsExpectedOne.setPhoneNumberHome("0444404545");
        contactsExpectedOne.setPhoneNumberMobile("0968887979");
        contactsExpectedOne.setPhoneNumberMobileAlt("0968887878");
        contactsExpectedOne.setEmail("john@gmail.com");
        contactsExpectedOne.setSkype("john");
        noteExpectedOne.setContacts(contactsExpectedOne);

        Address addressExpectedOne = new Address();
        addressExpectedOne.setPostIndex("02105");
        addressExpectedOne.setCity("Kiev");
        addressExpectedOne.setStreet("Tampere");
        addressExpectedOne.setHouseNumber("88");
        addressExpectedOne.setApartmentNumber("44");
        addressExpectedOne.setFullAddress("02105, Kiev, Tampere, 88, 44");
        noteExpectedOne.setAddress(addressExpectedOne);




        InputUtil inputUtil = new InputUtil();
        inputUtil.setLastName("John");
        inputUtil.setFirstName("Smith");
        inputUtil.setMiddleName("Arnold");
        inputUtil.setNickName("syllas");
        inputUtil.setCommentary("Test Note");
        inputUtil.setGroup(Group.FAMILY);
        inputUtil.setPhoneNumberHome("0444404545");
        inputUtil.setPhoneNumberMobile("0968887979");
        inputUtil.setPhoneNumberMobileAlt("0968887878");
        inputUtil.setEmail("john@gmail.com");
        inputUtil.setSkype("john");
        inputUtil.setPostIndex("02105");
        inputUtil.setCity("Kiev");
        inputUtil.setStreet("Tampere");
        inputUtil.setHouseNumber("88");
        inputUtil.setApartmentNumber("44");

        Model model = new Model();
        model.createNote(inputUtil);

        notebookExpected.addNote(noteExpectedOne, inputUtil);

        Notebook notebookActual = model.getNotebook();
        Assert.assertEquals(notebookExpected, notebookActual);
    }

}