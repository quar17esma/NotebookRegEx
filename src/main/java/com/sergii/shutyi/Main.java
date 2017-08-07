package com.sergii.shutyi;

import com.sergii.shutyi.controllerr.ControllerConsole;
import com.sergii.shutyi.modell.Model;
import com.sergii.shutyi.vieww.View;

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
