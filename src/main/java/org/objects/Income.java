package org.objects;

import org.calculations.Calculator;

import java.math.BigDecimal;

public class Income {

    private BigDecimal income;

    Calculator calculator = new Calculator();

    public Income(int income) {
        this.income = BigDecimal.valueOf(income);
    }

    public void addIncome(String s) {
        this.income = income.add(BigDecimal.valueOf(Double.parseDouble(s)));
    }

    public BigDecimal getIncome() {
        return income;
    }
}
