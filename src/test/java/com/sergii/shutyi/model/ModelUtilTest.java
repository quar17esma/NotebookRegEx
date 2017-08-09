package com.sergii.shutyi.model;

import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.controller.InputDataUtilWeb;
import com.sergii.shutyi.model.entity.Address;
import com.sergii.shutyi.model.entity.Contacts;
import com.sergii.shutyi.model.entity.Note;
import com.sergii.shutyi.model.enums.Group;
import org.junit.Assert;
import org.junit.Test;

public class ModelUtilTest {
    @Test
    public void setAllData() throws Exception {

        Note noteExpect = new Note();
        noteExpect.setLastName("John");
        noteExpect.setFirstName("Smith");
        noteExpect.setMiddleName("Arnold");
        noteExpect.setLastNameInitials("John S.");
        noteExpect.setNickName("syllas");
        noteExpect.setCommentary("Test Note");
        noteExpect.setGroup(Group.FAMILY);

        Contacts contactsExpect = new Contacts();
        contactsExpect.setPhoneNumberHome("0444404545");
        contactsExpect.setPhoneNumberMobile("0968887979");
        contactsExpect.setPhoneNumberMobileAlt("0968887878");
        contactsExpect.setEmail("john@gmail.com");
        contactsExpect.setSkype("john");
        noteExpect.setContacts(contactsExpect);

        Address addressExpect = new Address();
        addressExpect.setPostIndex("02105");
        addressExpect.setCity("Kiev");
        addressExpect.setStreet("Tampere");
        addressExpect.setHouseNumber("88");
        addressExpect.setApartmentNumber("44");
        addressExpect.setFullAddress("02105, Kiev, Tampere, 88, 44");
        noteExpect.setAddress(addressExpect);


        Note noteActual = new Note();

        InputDataUtilWeb inputDataUtil = new InputDataUtilWeb();
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
        inputDataUtil.setInputData(inputData);

        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(noteActual, inputDataUtil.getInputData());

        Assert.assertEquals(noteExpect, noteActual);
    }

}