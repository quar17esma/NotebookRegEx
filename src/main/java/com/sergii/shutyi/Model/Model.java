package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Note;

public class Model {

    Note note;

    public void createNote(InputUtil inputUtil){
        note = new Note();
        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(note, inputUtil);
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
