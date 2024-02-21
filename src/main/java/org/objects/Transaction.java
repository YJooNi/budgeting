package org.objects;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class Transaction {

    private String date;
    private String description;
    private BigDecimal price;
    private String allocationTitle;

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

    public String getAllocationTitle() {
        return allocationTitle;
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

    public void setAllocationTitle(String allocationTitle) {
        this.allocationTitle = allocationTitle;
    }

}
