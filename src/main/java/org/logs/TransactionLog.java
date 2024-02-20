package org.logs;

import org.objects.Transaction;

import java.util.Map;

public class TransactionLog {

    public void viewTransactionLog(Map<Integer, Transaction> transactionMap) {

        if(transactionMap.values().isEmpty()) {

            System.out.println("There is no current transaction made in log");
        }
        else {
            for(int i = 1; i - 1 < transactionMap.size(); i++) {

                System.out.println(
                        "Date: " + transactionMap.get(i).getDate() +
                        " | Description: " + transactionMap.get(i).getDescription() +
                        " | Price: " + transactionMap.get(i).getPrice() +
                        " | Allocation: " + transactionMap.get(i).getAllocationTitle());

            }
        }
    }
}
