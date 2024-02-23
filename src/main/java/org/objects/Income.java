package org.objects;

import org.calculations.Calculator;

import java.math.BigDecimal;

public class Income {

    private BigDecimal incomeInformation;

    Calculator calculator = new Calculator();

    public Income(String userInput) {
        incomeInformation = BigDecimal.valueOf(Integer.parseInt(userInput)).setScale(2);
    }

    public BigDecimal addIncome(BigDecimal a) {
        return calculator.addition(incomeInformation, a);
    }



}
