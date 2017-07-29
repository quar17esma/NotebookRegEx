package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputUtil;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.Model.entity.Notebook;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class Model {

    Notebook notebook = new Notebook();

    /**
     * Creates new Note and fills it with inputted data
     * @param inputUtil consists inputted data
     */
    public void createNote(InputUtil inputUtil){
        Note note = new Note();
        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(note, inputUtil);
        notebook.addNote(note);
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
