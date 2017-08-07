package com.sergii.shutyi.modell.entity;

import com.sergii.shutyi.controllerr.InputData;
import com.sergii.shutyi.exceptionss.BusyNickNameException;

import java.util.ArrayList;

/**
 * Represents notebook that stores all {@code Note} objects.
 *
 * @author S.Shutyi
 * Created on 26.07.2017
 */
public class Notebook {

    /**
     * List of all {@code Note} objects in {@code Notebook}
     */
    private ArrayList<Note> notesList = new ArrayList<>();

    /**
     * Adds {@code Note} to the {@code Notebook}.
     * @param newNote {@code Note} to add
     * @param inputData contains inputted data, needed if exception occurs
     * @throws BusyNickNameException if nick name from {@code Note} to add is already busy
     * by another {@code Note} in the {@code Notebook}
     */
    public void addNote(Note newNote, InputData inputData) throws BusyNickNameException {
        if (!notesList.isEmpty()) {
            for (Note note:notesList) {
                if (note.getNickName().equals(newNote.getNickName())){
                    throw new BusyNickNameException("This nick name is already busy", inputData);
                }
            }
        }

        notesList.add(newNote);
    }

    public ArrayList<Note> getNotesList() {
        return notesList;
    }

    public void setNotesList(ArrayList<Note> notesList) {
        this.notesList = notesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebook notebook = (Notebook) o;

        return getNotesList() != null ? getNotesList().equals(notebook.getNotesList()) : notebook.getNotesList() == null;
    }

    @Override
    public int hashCode() {
        return getNotesList() != null ? getNotesList().hashCode() : 0;
    }
}
