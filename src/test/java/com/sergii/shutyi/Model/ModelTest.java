package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputDataUtilConsole;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Contacts;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.Model.entity.Notebook;
import com.sergii.shutyi.Model.enums.Group;
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




        InputDataUtilConsole inputDataUtilConsole = new InputDataUtilConsole();
        inputDataUtilConsole.setLastName("John");
        inputDataUtilConsole.setFirstName("Smith");
        inputDataUtilConsole.setMiddleName("Arnold");
        inputDataUtilConsole.setNickName("syllas");
        inputDataUtilConsole.setCommentary("Test Note");
        inputDataUtilConsole.setGroup(Group.FAMILY);
        inputDataUtilConsole.setPhoneNumberHome("0444404545");
        inputDataUtilConsole.setPhoneNumberMobile("0968887979");
        inputDataUtilConsole.setPhoneNumberMobileAlt("0968887878");
        inputDataUtilConsole.setEmail("john@gmail.com");
        inputDataUtilConsole.setSkype("john");
        inputDataUtilConsole.setPostIndex("02105");
        inputDataUtilConsole.setCity("Kiev");
        inputDataUtilConsole.setStreet("Tampere");
        inputDataUtilConsole.setHouseNumber("88");
        inputDataUtilConsole.setApartmentNumber("44");

        Model model = new Model();
        model.createNote(inputDataUtilConsole);

        notebookExpected.addNote(noteExpectedOne, inputDataUtilConsole);

        Notebook notebookActual = model.getNotebook();
        Assert.assertEquals(notebookExpected, notebookActual);
    }

}