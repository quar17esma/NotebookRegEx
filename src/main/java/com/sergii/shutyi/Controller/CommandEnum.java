package com.sergii.shutyi.Controller;

public enum CommandEnum {
    ADD_NOTE{
        {
            this.command = new AddNoteCommand();
        }
    },
    SHOW_NOTEBOOK{
        {
            this.command = new ShowNotebookCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand(){
        return command;
    }
}
