package org.logs;

import org.objects.Transaction;

import java.util.Map;

public class TransactionLog {

    public void viewTransactionLog(Map<Integer, Transaction> transactionMap) {

        //this for loop is for all the transaction details, showing up in the transaction log
            for(int i = 1; i - 1 < transactionMap.size(); i++) {
                System.out.println(
                        "Date: " + transactionMap.get(i).getDate() +
                        " | Description: " + transactionMap.get(i).getDescription() +
                        " | Price: " + transactionMap.get(i).getPrice() +
                        " | Allocation: " + transactionMap.get(i).getAllocationTitle());
        }
    }
}
