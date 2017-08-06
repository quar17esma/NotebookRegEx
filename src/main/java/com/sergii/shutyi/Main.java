package com.sergii.shutyi;

import com.sergii.shutyi.Controller.ControllerConsole;
import com.sergii.shutyi.Model.Model;
import com.sergii.shutyi.View.View;

/**
 * Created by S.Shutyi on 26.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        ControllerConsole controller = new ControllerConsole(model, view);
        // Run
        controller.processUser();
    }
}
