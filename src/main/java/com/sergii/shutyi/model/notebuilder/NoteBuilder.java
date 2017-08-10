package com.sergii.shutyi.model.notebuilder;

import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.model.entity.Note;
import com.sergii.shutyi.model.enums.Group;

import java.util.Date;

public interface NoteBuilder {
    Note getNote();
    void buildFirstName(String firstName);
    void buildLastName(String lastName);
    void buildMiddleName(String middleName);
    void buildLastNameInitials(InputData inputData);
    void buildNickName(String nickName);
    void buildCommentary(String commentary);
    void buildGroup(Group group);
    void buildContacts(InputData inputData);
    void buildAddress(InputData inputData);
    void buildDateNoteAdded(Date dateNoteAdded);
    void buildDateNoteLastModified(Date dateNoteLastModified);
}
