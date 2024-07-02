package com.tnsif.wildcard.assignment_4;

import java.util.List;

public class UpperBoundedWildCard {

    // Generic method using upper-bounded wildcard to sum list elements
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
