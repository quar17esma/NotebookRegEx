package com.sergii.shutyi.model;

import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.controller.InputDataUtilWeb;
import com.sergii.shutyi.model.entity.Address;
import com.sergii.shutyi.model.entity.Contacts;
import com.sergii.shutyi.model.entity.Note;
import com.sergii.shutyi.model.entity.Notebook;
import com.sergii.shutyi.model.enums.Group;
import org.junit.Assert;
import org.junit.Test;

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



        InputData inputData = new InputData();
        inputData.setLastName("John");
        inputData.setFirstName("Smith");
        inputData.setMiddleName("Arnold");
        inputData.setNickName("syllas");
        inputData.setCommentary("Test Note");
        inputData.setGroup(Group.FAMILY);
        inputData.setPhoneNumberHome("0444404545");
        inputData.setPhoneNumberMobile("0968887979");
        inputData.setPhoneNumberMobileAlt("0968887878");
        inputData.setEmail("john@gmail.com");
        inputData.setSkype("john");
        inputData.setPostIndex("02105");
        inputData.setCity("Kiev");
        inputData.setStreet("Tampere");
        inputData.setHouseNumber("88");
        inputData.setApartmentNumber("44");


        Model model = new Model();
        model.createNote(inputData);

        notebookExpected.addNote(noteExpectedOne, inputData);

        Notebook notebookActual = model.getNotebook();
        Assert.assertEquals(notebookExpected, notebookActual);
    }

}