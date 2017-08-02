package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputDataUtilConsole;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Contacts;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.Model.enums.Group;
import org.junit.Assert;
import org.junit.Test;

public class ModelUtilTest {
    @Test
    public void setAllData() throws Exception {

        Note noteExpected = new Note();
        noteExpected.setLastName("John");
        noteExpected.setFirstName("Smith");
        noteExpected.setMiddleName("Arnold");
        noteExpected.setLastNameInitials("John S.");
        noteExpected.setNickName("syllas");
        noteExpected.setCommentary("Test Note");
        noteExpected.setGroup(Group.FAMILY);

        Contacts contactsExpected = new Contacts();
        contactsExpected.setPhoneNumberHome("0444404545");
        contactsExpected.setPhoneNumberMobile("0968887979");
        contactsExpected.setPhoneNumberMobileAlt("0968887878");
        contactsExpected.setEmail("john@gmail.com");
        contactsExpected.setSkype("john");
        noteExpected.setContacts(contactsExpected);

        Address addressExpected = new Address();
        addressExpected.setPostIndex("02105");
        addressExpected.setCity("Kiev");
        addressExpected.setStreet("Tampere");
        addressExpected.setHouseNumber("88");
        addressExpected.setApartmentNumber("44");
        addressExpected.setFullAddress("02105, Kiev, Tampere, 88, 44");
        noteExpected.setAddress(addressExpected);


        Note noteActual = new Note();

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

        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(noteActual, inputDataUtilConsole);

        Assert.assertEquals(noteExpected, noteActual);
    }

}