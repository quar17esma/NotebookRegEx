package com.sergii.shutyi.model;

import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.model.entity.Note;

import java.util.Date;
import java.util.Objects;

public class NoteDirector {
    private NoteBuilder noteBuilder;

    public NoteDirector(NoteBuilder noteBuilder) {
        this.noteBuilder = Objects.requireNonNull(noteBuilder);
    }

    public Note createNote(InputData inputData){
        Date dateNoteAdded = new Date();

        noteBuilder.buildFirstName(inputData.getFirstName());
        noteBuilder.buildLastName(inputData.getLastName());
        noteBuilder.buildMiddleName(inputData.getMiddleName());
        noteBuilder.buildLastNameInitials(inputData);
        noteBuilder.buildNickName(inputData.getNickName());
        noteBuilder.buildCommentary(inputData.getCommentary());
        noteBuilder.buildGroup(inputData.getGroup());
        noteBuilder.buildContacts(inputData);
        noteBuilder.buildAddress(inputData);
        noteBuilder.buildDateNoteAdded(dateNoteAdded);
        noteBuilder.buildDateNoteLastModified(dateNoteAdded);

        return noteBuilder.getNote();
    }
}
