package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Note;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class Model {

    Note note;

    /**
     * Creates new Note and fills it with inputted data
     * @param inputUtil consists inputted data
     */
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
