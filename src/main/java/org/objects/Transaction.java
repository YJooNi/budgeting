package org.objects;

import java.math.BigDecimal;

public class Transaction {

    private String date;
    private String description;
    private BigDecimal price;
    private String expenseTitle;

    //---------------------------------- constructor ----------------------------------

    public Transaction(){

    }

    //-------------------------------- getters ----------------------------------------

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    //--------------------------------- setters ----------------------------------------

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setExpenseTitle(String allocationTitle) {
        this.expenseTitle = allocationTitle;
    }

}
