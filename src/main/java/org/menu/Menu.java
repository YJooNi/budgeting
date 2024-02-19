package org.menu;

import java.util.Scanner;

public class Menu {
    private String PAGE_ONE = "page one";
    private String PAGE_TWO = "page two";
    private String PAGE_THREE = "page three";
    private String BACK_PAGE = "return to previous page";
    private String[] mainMenuList = new String[]{PAGE_ONE, PAGE_TWO, PAGE_THREE};
    private String[] menuPageOneList = new String[]{PAGE_ONE, BACK_PAGE};
    private String[] menuPageTwoList = new String[]{PAGE_ONE, BACK_PAGE};

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
        System.out.println("You have selected: " + selection);

        while(!selection.isBlank()) {
            if (selection.equals("1")) {
                mainMenu_Page1(selection);
                break;
            } else if (selection.equals("2")) {
                mainMenu_Page2(selection);
                break;
            } else if (selection.equals("3")) {
                System.out.println("You are in menu page three");
                break;
            } else {
                System.out.println("This option is invalid");
                break;
            }
        }
    }

    public void mainMenu_Page1(String selection) {
        menu(menuPageOneList);
        String page1_Selection = userInput();
        System.out.println("You have selected: " + page1_Selection);

        if(page1_Selection.equals())

        while(selection.equals("1")) {
            if (page1_Selection.equals("1")) {
                System.out.println("You are in menu page one");
            } else if (page1_Selection.equals("2")) {
                System.out.println("You are going back to the main menu");
                break;
            }
        }
    }

    public void mainMenu_Page2(String selection) {
        menu(menuPageTwoList);
        String page2_Selection = userInput();
        System.out.println("You have selected: " + page2_Selection);

        while(selection.equals("2")) {
            if (page2_Selection.equals("1")) {
                System.out.println("You are in menu page one");
            } else if (page2_Selection.equals("2")) {
                System.out.println("You are returning to the main menu");
                break;
            }
        }
    }

    public String userInput(){
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();
        return selection;
    }

}
