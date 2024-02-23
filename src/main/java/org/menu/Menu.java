package org.menu;

import org.calculations.Calculator;
import org.logs.TransactionLog;
import org.objects.Transaction;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    //need for creating new objects to use their methods
    TransactionLog transactionLog = new TransactionLog();
    Calculator calculator = new Calculator();

    //------------------------------------------ strings and string lists for menu displays -------------------------
    private final String TRANSACTION_LOG = "View Your Transaction Log";
    private final String PAGE_TWO = "page two";
    private final String NEW_TP_LOG = "Add New Transaction/Monthly Payment";
    private final String BACK_PAGE = "return to previous page";
    private final String CLOSE_APPLICATION = "Exit Application";

    //------------------------------------- main menu selection numbers -----------------------------------------
    public final String MENU_TLOG = "1";
    public final String MENU_ADD_INCOME = "2";
    public final String MENU_ADD_TP = "3";
    public final String MENU_EXIT = "4";

    //------------------------------------ Transaction Log w/ Editing Page 1 Menu -----------------------------
    private final String EDIT_LOG = "Edit a Transaction";

    //------------------------------------- Transaction Log menu selection numbers -----------------------------
    public final String MENU_LOG_EDIT = "1";
    public final String MENU_GOBACK_PG1 = "2";

    //------------------------------------ New Income/Money Allocation Page 2 Menu -------------------------------

    //---------------------------- New Income/Money Allocation Menu Selection numbers --------------------------



    //---------------------------------- New Transaction/Monthly Payment Page 3 Menu ----------------------------
    private final String NEW_MONTHLY_PAYMENT = "Add a Monthly Payment";
    private final String NEW_TRANSACTION = "Add New Transaction";

    //------------------------------------- transaction/monthly menu selection numbers ---------------------------
    public final String MENU_NEWTRANSACTION = "1";
    public final String MENU_NEWMONTHLYPAYMENT = "2";
    public final String MENU_GOBACK_PG3 = "3";

    //------------------------------- String list for For Loop Menus -----------------------------------------
    private final String[] mainMenuList = new String[]{TRANSACTION_LOG, PAGE_TWO, NEW_TP_LOG, CLOSE_APPLICATION};
    private final String[] menuPageOneList = new String[]{EDIT_LOG, BACK_PAGE};
    private final String[] menuPageTwoList = new String[]{TRANSACTION_LOG, BACK_PAGE};
    private final String[] menuPageThreeList = new String[]{NEW_TRANSACTION, NEW_MONTHLY_PAYMENT, BACK_PAGE};

    //--------------------------------- menu creation -------------------------------------

    //this method creates a menu for the user
    public void menu(String[] string_List) {
        int number = 1;

        //the for loop creates a menu with a number and a string
        for (String s : string_List) {
            System.out.println(number + ": " + s);
            number++;
        }
        System.out.println("Please select a number: ");
    }

    // --------------------------------- main menu method ----------------------------------

    //this method is for the main menu selection for the user
    public void mainMenu(Map<Integer, Transaction> transactionMap) {

        //prints main menu display
        mainMenuDisplay();

        //prints out main menu
        menu(mainMenuList);

        //gets the user input for menu selection
        String selection = userInput();

        switch (selection) {
            case MENU_TLOG ->

                //user enters to menu selection 1
                    mainMenu_TransactionLog(selection, transactionMap);

            case MENU_ADD_INCOME ->

                //user enters to menu selection 2
                    mainMenu_Page2(selection);


            case MENU_ADD_TP ->

                //user enters to menu selection 3
                    mainMenu_NewTransaction(selection, transactionMap);

            case MENU_EXIT -> {

                //user exits the menu and application
                System.out.println("You are now exiting out of the application");
                System.exit(0);
            }
            default ->

                //prevents user to break the selection menus
                    System.out.println("Invalid option");
        }
    }

    //------------------------------------ page menu methods ----------------------------------

    //user is able to view transactions and edit specific ones ------------- Page 1 --------------
    public void mainMenu_TransactionLog(String selection, Map<Integer, Transaction> transactionMap) {

        outer_loop1:

        //the while loop keeps the user in page 1 menu
        while(selection.equals(MENU_TLOG)) {

            //prints page 1 menu display
                page1MenuDisplay();

                //if the map is not empty the transaction log will show along with total amount
                if(!transactionMap.isEmpty()) {

                    //creates a log for transactions created
                        transactionLog.viewTransactionLog(transactionMap);

                    //displays total amount spent in total
                        totalAmountDisplay(transactionMap);
                }
                else {

                    //prints out a message if there is no current transaction in log
                        noTransactionLogDisplay();
                }

            //creates a menu for page 1 for the user to select from
                menu(menuPageOneList);

            //gets the user input for menu selection
                String page1_Selection = userInput();

                switch(page1_Selection) {

                    case MENU_LOG_EDIT:

                    //if there is no transaction log, it will show the user an error message.
                        if(transactionMap.isEmpty()) {
                            noEditingTransactionDisplay();
                        }
                        //if the transaction log isn't empty, they can edit the transaction
                        else {
                            System.out.println("Which transaction would you like to edit? test");
                        }
                        break;

                    case MENU_GOBACK_PG1:

                    //user goes back to the main menu
                        System.out.println("You are going back to the main menu");
                        break outer_loop1;

                    default:

                    //prevents user to break the selection menus
                        System.out.println("Invalid input");

            }
        }
    }

    //second page of menu ------------ Page 2 ------------------
    public void mainMenu_Page2(String selection) {

        outer_loop2:
        //the while loop keeps the user in page 2 menu
            while(selection.equals("2")) {

            //prints page 2 menu display
                page2MenuDisplay();

            //creates a menu for page 2 for the user to select from
                menu(menuPageTwoList);

            //gets the user input for menu selection
                String page2_Selection = userInput();

                switch (page2_Selection) {

                    case "1":

                    //user enters menu selection 1
                        System.out.println("You are in menu page one");
                        break;

                    case "2":

                    //user goes back to the main menu
                        System.out.println("You are returning to the main menu");
                        break outer_loop2;

                    default:

                    //prevents user to break the selection menus
                        System.out.println("Invalid input");
            }
        }
    }

    //creating new transaction and/or monthly payment --------- PAGE 3 ----------
    public void mainMenu_NewTransaction(String selection, Map<Integer, Transaction> transactionMap) {

        outer_loop3:
        //the while loop keeps the user in page 3 menu
            while(selection.equals(MENU_ADD_TP)) {

            //prints page 3 menu display
                NewTransactionMenuDisplay();

            //creates a menu for page 3 for the user to select from
                menu(menuPageThreeList);

            //gets the user input for menu selection
                String page3_Selection = userInput();

                switch (page3_Selection){

                    case MENU_NEWTRANSACTION:

                    //user enters menu selection 1 for new transaction
                        System.out.println("You are going to create a new transaction");

                    //creates a new transaction object to store information
                        TransactionCreationMenu transactionCreationMenu = new TransactionCreationMenu();

                    //if the transaction map is empty, it will add a key to the first one
                        if(transactionMap.isEmpty()) {

                        //starts a new transaction map at 1, if there was none
                            transactionMap.put(1,transactionCreationMenu.newTransaction());
                        }
                        else {

                        //if the map is not empty, it will add 1 to the key and add a new transaction to the map
                            int i = transactionMap.size() + 1;
                            transactionMap.put(i,transactionCreationMenu.newTransaction());
                        }

                    //shows a message to the user that the transaction has been made
                        successfulTransactionDisplay();
                        break;

                    case MENU_NEWMONTHLYPAYMENT:

                    //user enters menu selection 2 for new transaction
                        System.out.println("You are going to create a new monthly payment");
                        break;

                    case MENU_GOBACK_PG3:

                    //user enters menu selection 3 to go back to the main menu
                        System.out.println("You are returning to the main menu");
                        break outer_loop3;

                    default:

                    //prevents user to break the selection menus
                        System.out.println("Invalid input");
            }
        }

    }

    //--------------------------- method for user inputs ---------------------------------------

    public String userInput(){

        //user enters an input for menu selection
            Scanner userInput = new Scanner(System.in);

        //returns the inputted string
            return userInput.nextLine();
    }


    // -------------------------- Displays with sout methods -----------------------------------

    public void mainMenuDisplay() {System.out.println("Main Menu");}

    public void page1MenuDisplay() {System.out.println("Transaction Log Menu");}

    public void page2MenuDisplay() {System.out.println("Page Two Menu");}

    public void NewTransactionMenuDisplay() {System.out.println("Create A New Transaction/Monthly Payment");}

    public void successfulTransactionDisplay(){System.out.println("You have successfully created a new Transaction");}

    public void noEditingTransactionDisplay(){
        System.out.println("There is no current transaction to edit");
    }

    public void noTransactionLogDisplay(){
        System.out.println("There is no current transaction made in log");
    }


    //-------------------------------------- displays with calculation methods ---------------------------------

    //this method is to add total amount from the transaction map
    public void totalAmountDisplay(Map<Integer, Transaction> transactionMap){

            BigDecimal totalAmount = BigDecimal.valueOf(0);

        //this for loop gets all the prices and adds them together
            for(Transaction transaction : transactionMap.values()) {
                totalAmount = calculator.addition(totalAmount, transaction.getPrice());
            }

            System.out.println("Total Amount Spent: $" + totalAmount);

    }
}