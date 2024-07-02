package com.tnsif.wildcard.assignment_4;

import java.util.List;

public class UnBoundedWildCard {

    // Generic method using unbounded wildcard to display list elements
    public static void display(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
