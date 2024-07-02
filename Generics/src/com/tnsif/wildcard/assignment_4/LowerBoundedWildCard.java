package com.tnsif.wildcard.assignment_4;

import java.util.List;

public class LowerBoundedWildCard {

    // Generic method using lower-bounded wildcard to display list elements
    public static void displayNumbers(List<? super Integer> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
