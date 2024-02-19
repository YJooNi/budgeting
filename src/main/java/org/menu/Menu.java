package org.menu;

import java.util.Scanner;

public class Menu {
    private String PAGE_ONE = "page one";
    private String PAGE_TWO = "page two";
    private String PAGE_THREE = "page three";
    private String CLOSE_APPLICATION = "Exit Application";
    private String BACK_PAGE = "return to previous page";
    private String[] mainMenuList = new String[]{PAGE_ONE, PAGE_TWO, PAGE_THREE, CLOSE_APPLICATION};
    private String[] menuPageOneList = new String[]{PAGE_ONE, BACK_PAGE};
    private String[] menuPageTwoList = new String[]{PAGE_ONE, BACK_PAGE};
    private String[] menuPageThreeList = new String[]{PAGE_ONE, BACK_PAGE};

    public void menu(String[] string_List) {
        int number = 1;
        System.out.println("Main Menu");
        for (String s : string_List) {
            System.out.println(number + ": " + s);
            number++;
        }
        System.out.println("Please select a number: ");
    }

    public void mainMenu() {

        menu(mainMenuList);
        String selection = userInput();

        while(!selection.isBlank()) {

            if (selection.equals("1")) {
                mainMenu_Page1(selection);
                break;
            }
            else if (selection.equals("2")) {
                mainMenu_Page2(selection);
                break;
            }
            else if (selection.equals("3")) {
                mainMenu_Page3(selection);
                break;
            }
            else if (selection.equals("4")) {
                System.out.println("You are now exiting out of the application");
                System.exit(0);
            }
            else {
                System.out.println("Invalid option");
                break;
            }
        }
    }

    public void mainMenu_Page1(String selection) {
        while(selection.equals("1")) {

            menu(menuPageOneList);
            String page1_Selection = userInput();

            if (page1_Selection.equals("1")) {
                System.out.println("You are in menu page one");
            }
            else if (page1_Selection.equals("2")) {
                System.out.println("You are going back to the main menu");
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    public void mainMenu_Page2(String selection) {
        while(selection.equals("2")) {

            menu(menuPageTwoList);
            String page2_Selection = userInput();

            if (page2_Selection.equals("1")) {
                System.out.println("You are in menu page one");
            }
            else if (page2_Selection.equals("2")) {
                System.out.println("You are returning to the main menu");
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    public void mainMenu_Page3(String selection) {
        while(selection.equals("3")) {

            menu(menuPageThreeList);
            String page3_Selection = userInput();

            if (page3_Selection.equals("1")) {
                System.out.println("You are in menu page one");
            }
            else if (page3_Selection.equals("2")) {
                System.out.println("You are returning to the main menu");
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    public String userInput(){
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();
        return selection;
    }

}
