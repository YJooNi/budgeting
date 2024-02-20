package org.menu;

import java.util.Scanner;

public class Menu {

    //------------------------------------------ strings and string lists for menu displays ----------------------------------
    private String PAGE_ONE = "page one";
    private String PAGE_TWO = "page two";
    private String PAGE_THREE = "page three";
    private String BACK_PAGE = "return to previous page";
    private String CLOSE_APPLICATION = "Exit Application";
    private String[] mainMenuList = new String[]{PAGE_ONE, PAGE_TWO, PAGE_THREE, CLOSE_APPLICATION};
    private String[] menuPageOneList = new String[]{PAGE_ONE, BACK_PAGE};
    private String[] menuPageTwoList = new String[]{PAGE_ONE, BACK_PAGE};
    private String[] menuPageThreeList = new String[]{PAGE_ONE, BACK_PAGE};

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
    public void mainMenu() {

        //prints main menu display
        mainMenuDisplay();

        //prints out main menu
        menu(mainMenuList);

        //gets the user input for menu selection
        String selection = userInput();

        //needs a while loop for breaks;
        while(!selection.isBlank()) {

            if (selection.equals("1")) {

                //user enters to menu selection 1
                mainMenu_Page1(selection);
                break;
            }
            else if (selection.equals("2")) {

                //user enters to menu selection 2
                mainMenu_Page2(selection);
                break;
            }
            else if (selection.equals("3")) {

                //user enters to menu selection 3
                mainMenu_Page3(selection);
                break;
            }
            else if (selection.equals("4")) {
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
    public void mainMenu_Page1(String selection) {

        //the while loop keeps the user in page 1 menu
        while(selection.equals("1")) {

            //prints page 1 menu display
            page1MenuDisplay();

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

    //third page of menu
    public void mainMenu_Page3(String selection) {

        //the while loop keeps the user in page 3 menu
        while(selection.equals("3")) {

            //prints page 3 menu display
            page3MenuDisplay();

            //creates a menu for page 3 for the user to select from
            menu(menuPageThreeList);

            //gets the user input for menu selection
            String page3_Selection = userInput();

            if (page3_Selection.equals("1")) {

                //user enters menu selection 1
                System.out.println("You are in menu page one");
            }
            else if (page3_Selection.equals("2")) {

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

    //--------------------------- method for user inputs ---------------------------------------

    public String userInput(){

        //user enters an input for menu selection
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();

        //returns the inputted string
        return selection;
    }


    // -------------------------- Displays with sout methods -----------------------------------

    public void mainMenuDisplay() {
        System.out.println("Main Menu");
    }

    public void page1MenuDisplay() {
        System.out.println("Page One Menu");
    }

    public void page2MenuDisplay() {
        System.out.println("Page Two Menu");
    }

    public void page3MenuDisplay() {
        System.out.println("Page Three Menu");
    }


}
