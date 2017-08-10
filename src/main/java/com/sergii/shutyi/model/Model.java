package com.sergii.shutyi.model;

import com.sergii.shutyi.controller.InputData;
import com.sergii.shutyi.exceptions.BusyNickNameException;
import com.sergii.shutyi.model.entity.Note;
import com.sergii.shutyi.model.entity.Notebook;
import com.sergii.shutyi.model.notebuilder.ConcreteNoteBuilder;
import com.sergii.shutyi.model.notebuilder.NoteDirector;

/**
 * The {@code model} class represents entities to store data and business logic.
 *
 * @author S.Shutyi
 * Created on 26.07.2017.
 */
public class Model {

    /**
     * Entity for storing all {@code Note} objects.
     */
    Notebook notebook = new Notebook();

    /**
     * Creates {@code new Note} and adds it to {@code Notebook}.
     * <p>
     * Creates {@code new Note} and fills it with inputted data.
     * If data is incorrect than asks for entering correct data and tries again.
     * @param inputData consists inputted data.
     * @return {@code true} if {@code Note} is successfully created and added to {@code Notebook}.
     * @throws BusyNickNameException if {@code Note} with inputted login is already stored in {@code Notebook}.
     */
    public boolean createNote(InputData inputData) throws BusyNickNameException {
        NoteDirector noteDirector = new NoteDirector(new ConcreteNoteBuilder());
        Note note = noteDirector.createNote(inputData);
        notebook.addNote(note, inputData);

        return true;
    }

    //getters and setters
    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
