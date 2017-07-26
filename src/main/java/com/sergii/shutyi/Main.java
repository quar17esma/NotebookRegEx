package com.sergii.shutyi;

import com.sergii.shutyi.Controller.Controller;
import com.sergii.shutyi.Model.Model;
import com.sergii.shutyi.Model.entity.Note;
import com.sergii.shutyi.View.View;

/**
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
