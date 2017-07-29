package com.sergii.shutyi.Model.entity;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notesList;

    public ArrayList<Note> getNotesList() {
        return notesList;
    }

    public void setNotesList(ArrayList<Note> notesList) {
        this.notesList = notesList;
    }
}
