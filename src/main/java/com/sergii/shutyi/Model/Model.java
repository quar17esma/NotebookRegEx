package com.sergii.shutyi.Model;

import com.sergii.shutyi.Controller.InputDataUtil;
import com.sergii.shutyi.Exceptions.BusyLoginException;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.Model.entity.Notebook;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class Model {

    Notebook notebook = new Notebook();

    /**
     * Creates new Note and fills it with inputted data
     * @param inputData consists inputted data
     */
    public boolean createNote(InputDataUtil inputData) throws BusyLoginException {
        Note note = new Note();
        ModelUtil modelUtil = new ModelUtil();
        modelUtil.setAllData(note, inputData);
        notebook.addNote(note, inputData);
        return true;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
