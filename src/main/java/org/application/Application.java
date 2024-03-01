package org.application;

import org.menu.Menu;
import org.objects.Income;
import org.objects.Transaction;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    //creates menus for the user
    Menu menu = new Menu();

    Income income = new Income(0);

    //creates a map to hold all the transactions
    Map<Integer, Transaction> transactionMap = new TreeMap<>();

    public void run() {

        //this is for a new user
        menu.enterIncome(income);

        //the while loop keeps the user in main menu even if it breaks after the methods run
        while(true){
            menu.mainMenu(transactionMap, income);
        }
    }

}
