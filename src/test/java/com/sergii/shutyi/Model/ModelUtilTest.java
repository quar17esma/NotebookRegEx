package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Address;
import com.sergii.shutyi.Model.entity.Note;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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
        noteExpected.setPhoneNumberHome("0444404545");
        noteExpected.setPhoneNumberMobile("0968887979");
        noteExpected.setPhoneNumberMobileAlt("0968887878");
        noteExpected.setEmail("john@gmail.com");
        noteExpected.setSkype("john");

        Address addressExpected = new Address();
        addressExpected.setPostIndex("02105");
        addressExpected.setCity("Kiev");
        addressExpected.setStreet("Tampere");
        addressExpected.setHouseNumber("88");
        addressExpected.setApartmentNumber("44");
        addressExpected.setFullAddress("02105, Kiev, Tampere, 88, 44");
        noteExpected.setAddress(addressExpected);

        
        Note noteActual = new Note();

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

        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(noteActual, inputUtil);

        Assert.assertEquals(noteExpected, noteActual);
    }

}