package org.application;

import org.menu.Menu;

public class Application {
    Menu menu = new Menu();
    public void run() {

        //the while loop keeps the user in main menu even if it breaks after the methods run
        while(true){
            menu.mainMenu();
        }
    }

}
