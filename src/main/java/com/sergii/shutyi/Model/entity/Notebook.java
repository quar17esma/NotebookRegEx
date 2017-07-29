package com.sergii.shutyi.Model.entity;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notesList = new ArrayList<>();

    public void addNote(Note note){
        notesList.add(note);
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
