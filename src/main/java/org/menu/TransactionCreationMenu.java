package org.menu;

import org.objects.Transaction;

import java.math.BigDecimal;

public class TransactionCreationMenu {

    //this method creates a new transaction by the user inputs
    public Transaction newTransaction() {

        Transaction transaction = new Transaction();

        //the user adds the date and sets into the transaction object
        System.out.println("Please enter a date (MM/DD/YYYY): ");
        transaction.setDate(new Menu().userInput());

        //the user adds the description and sets into the transaction object
        System.out.println("Please enter a description: ");
        transaction.setDescription(new Menu().userInput());

        //the user adds the price and sets into the transaction object
        System.out.print("Please enter a price: \n$");
        transaction.setPrice(BigDecimal.valueOf(Double.parseDouble(new Menu().userInput())).setScale(2));

        //the user adds the allocation title and sets into the transaction object
        System.out.println("Please enter an expense name: ");
        transaction.setExpenseTitle(new Menu().userInput());

        return transaction;
    }


}
