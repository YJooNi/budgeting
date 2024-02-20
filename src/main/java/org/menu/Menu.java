package org.menu;

import org.logs.TransactionLog;
import org.objects.Transaction;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Menu {

    TransactionLog transactionLog = new TransactionLog();

    //------------------------------------------ strings and string lists for menu displays -------------------------
    private String TRANSACTION_LOG = "View Your Transaction Log";
    private String PAGE_TWO = "page two";
    private String NEW_TP_LOG = "Add New Transaction/Monthly Payment";
    private String BACK_PAGE = "return to previous page";
    private String CLOSE_APPLICATION = "Exit Application";

    //------------------------------------- main menu selection numbers -------------------------------------------
    private String MENU_TLOG = "1";
    private String MENU_ADD_INCOME = "2";
    private String MENU_ADD_TP = "3";
    private String MENU_EXIT = "4";

    //------------------------------------ Transaction Log w/ Editing Page 1 Menu -----------------------
    private String EDIT_LOG = "Edit a Transaction";

    //------------------------------------ New Transaction/Monthly Payment Page 3 Menu -----------------------
    private String NEW_MONTHLY_PAYMENT = "Add a Monthly Payment";
    private String NEW_TRANSACTION = "Add New Transaction/Monthly Payment";
    //------------------------------------- transaction/monthly menu selection numbers ---------------------------
    private String MENU_NEWTRANSACTION = "1";
    private String MENU_NEWMONTHLYPAYMENT = "2";
    private String MENU_GOBACK = "3";

    //------------------------------- String list for For Loop Menus -----------------------------------------
    private String[] mainMenuList = new String[]{TRANSACTION_LOG, PAGE_TWO, NEW_TP_LOG, CLOSE_APPLICATION};
    private String[] menuPageOneList = new String[]{EDIT_LOG, BACK_PAGE};
    private String[] menuPageTwoList = new String[]{TRANSACTION_LOG, BACK_PAGE};
    private String[] menuPageThreeList = new String[]{NEW_TRANSACTION, NEW_MONTHLY_PAYMENT, BACK_PAGE};

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

        //needs a while loop for breaks;
        while(!selection.isBlank()) {

            if (selection.equals(MENU_TLOG)) {

                //user enters to menu selection 1
                mainMenu_Page1(selection, transactionMap);
                break;
            }
            else if (selection.equals(MENU_ADD_INCOME)) {

                //user enters to menu selection 2
                mainMenu_Page2(selection);
                break;
            }
            else if (selection.equals(MENU_ADD_TP)) {

                //user enters to menu selection 3
                mainMenu_NewTransaction(selection, transactionMap);
                break;
            }
            else if (selection.equals(MENU_EXIT)) {
                //user exits the menu and application
                System.out.println("You are now exiting out of the application");
                System.exit(0);
            }
            else {
                //prevents user to break the selection menus
                System.out.println("Invalid option");
                break;
            }
        }
    }

    //------------------------------------ page menu methods ----------------------------------

    //first page of menu
    public void mainMenu_Page1(String selection, Map<Integer, Transaction> transactionMap) {

        //the while loop keeps the user in page 1 menu
        while(selection.equals("1")) {

            //prints page 1 menu display
            page1MenuDisplay();

            transactionLog.viewTransactionLog(transactionMap);

            //creates a menu for page 1 for the user to select from
            menu(menuPageOneList);

            //gets the user input for menu selection
            String page1_Selection = userInput();

            //the if statement checks to see if user selects one of the options
            if (page1_Selection.equals("1")) {

                //user enters menu selection 1
                System.out.println("You are in menu page one");
            }
            else if (page1_Selection.equals("2")) {

                //user goes back to the main menu
                System.out.println("You are going back to the main menu");
                break;
            }
            else {

                //prevents user to break the selection menus
                System.out.println("Invalid input");
            }
        }
    }

    //second page of menu
    public void mainMenu_Page2(String selection) {

        //the while loop keeps the user in page 2 menu
        while(selection.equals("2")) {

            //prints page 2 menu display
            page2MenuDisplay();

            //creates a menu for page 2 for the user to select from
            menu(menuPageTwoList);

            //gets the user input for menu selection
            String page2_Selection = userInput();

            if (page2_Selection.equals("1")) {

                //user enters menu selection 1
                System.out.println("You are in menu page one");
            }
            else if (page2_Selection.equals("2")) {

                //user goes back to the main menu
                System.out.println("You are returning to the main menu");
                break;
            }
            else {

                //prevents user to break the selection menus
                System.out.println("Invalid input");
            }
        }
    }

    //creating new transaction and/or monthly payment
    public void mainMenu_NewTransaction(String selection, Map<Integer, Transaction> transactionMap) {

        //the while loop keeps the user in page 3 menu
        while(selection.equals(MENU_ADD_TP)) {

            //prints page 3 menu display
            NewTransactionMenuDisplay();

            //creates a menu for page 3 for the user to select from
            menu(menuPageThreeList);

            //gets the user input for menu selection
            String page3_Selection = userInput();

            if (page3_Selection.equals(MENU_NEWTRANSACTION)) {

                //user enters menu selection 1 for new transaction
                System.out.println("You are going to create a new transaction");

                TransactionCreationMenu transactionCreationMenu = new TransactionCreationMenu();

                if(transactionMap.isEmpty()) {
                    transactionMap.put(1,transactionCreationMenu.newTransaction());
                    successfulTransactionDisplay();
                }
                else {
                    int i = transactionMap.size() + 1;
                    transactionMap.put(i,transactionCreationMenu.newTransaction());
                    successfulTransactionDisplay();
                }

            }
            else if (page3_Selection.equals(MENU_NEWMONTHLYPAYMENT)) {
                //user enters menu selection 2 for new transaction
                System.out.println("You are going to create a new monthly payment");
            }
            else if (page3_Selection.equals(MENU_GOBACK)) {

                //user enters menu selection 3 to go back to the main menu
                System.out.println("You are returning to the main menu");
                break;
            }
            else {

                //prevents user to break the selection menus
                System.out.println("Invalid input");
            }
        }
    }

    //--------------------------- method for user inputs ---------------------------------------

    public String userInput(){

        //user enters an input for menu selection
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();

        //returns the inputted string
        return selection;
    }


    // -------------------------- Displays with sout methods -----------------------------------

    public void mainMenuDisplay() {System.out.println("Main Menu");}

    public void page1MenuDisplay() {System.out.println("Transaction Log Menu");}

    public void page2MenuDisplay() {System.out.println("Page Two Menu");}

    public void NewTransactionMenuDisplay() {System.out.println("Create A New Transaction/Monthly Payment");}

    public void successfulTransactionDisplay(){System.out.println("You have successfully created a new Transaction");}


}
