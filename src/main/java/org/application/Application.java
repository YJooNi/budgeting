package org.application;

import org.menu.Menu;
import org.objects.Transaction;

import java.util.Map;
import java.util.TreeMap;

public class Application {

    //creates menus for the user
    Menu menu = new Menu();

    //creates a map to hold all the transactions
    Map<Integer, Transaction> transactionMap = new TreeMap<>();
    public void run() {

        //the while loop keeps the user in main menu even if it breaks after the methods run
        while(true){
            menu.mainMenu(transactionMap);
        }
    }

}
