package org.application;

import org.menu.Menu;

public class Application {
    Menu menu = new Menu();
    public void run() {
        while(true){
            menu.mainMenu();
        }
    }

}
