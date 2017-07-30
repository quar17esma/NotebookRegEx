package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputDataUtil;
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

        InputDataUtil inputDataUtil = new InputDataUtil();
        inputDataUtil.setLastName("John");
        inputDataUtil.setFirstName("Smith");
        inputDataUtil.setMiddleName("Arnold");
        inputDataUtil.setNickName("syllas");
        inputDataUtil.setCommentary("Test Note");
        inputDataUtil.setGroup(Group.FAMILY);
        inputDataUtil.setPhoneNumberHome("0444404545");
        inputDataUtil.setPhoneNumberMobile("0968887979");
        inputDataUtil.setPhoneNumberMobileAlt("0968887878");
        inputDataUtil.setEmail("john@gmail.com");
        inputDataUtil.setSkype("john");
        inputDataUtil.setPostIndex("02105");
        inputDataUtil.setCity("Kiev");
        inputDataUtil.setStreet("Tampere");
        inputDataUtil.setHouseNumber("88");
        inputDataUtil.setApartmentNumber("44");

        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(noteActual, inputDataUtil);

        Assert.assertEquals(noteExpected, noteActual);
    }

}