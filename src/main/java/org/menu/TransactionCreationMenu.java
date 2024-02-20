package org.menu;

import org.objects.Transaction;
import org.menu.Menu;

import java.math.BigDecimal;

public class TransactionCreationMenu {

    public Transaction newTransaction() {

        Transaction transaction = new Transaction();

        System.out.println("Please enter a date (MM/DD/YYYY): ");
        transaction.setDate(new Menu().userInput());

        System.out.println("Please enter a description: ");
        transaction.setDescription(new Menu().userInput());

        System.out.println("Please enter a price: \n$");
        transaction.setPrice(BigDecimal.valueOf(Double.parseDouble(new Menu().userInput())).setScale(2));

        System.out.println("Please enter an allocation title: ");
        transaction.setAllocationTitle(new Menu().userInput());

        return transaction;
    }


}
