package org.calculations;

import java.math.BigDecimal;

public class calculator {

    public BigDecimal addition( BigDecimal a, BigDecimal b) {
        return a.add(b).setScale(2);
    }

    public BigDecimal subtraction( BigDecimal a, BigDecimal b) {
        return a.subtract(b).setScale(2);
    }

    public BigDecimal multiplication( BigDecimal a, BigDecimal b) {
        return a.multiply(b).setScale(2);
    }

    public BigDecimal division( BigDecimal a, BigDecimal b) {
        return a.divide(b).setScale(2);
    }

}
