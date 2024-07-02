package com.tnsif.generics.assignment_1;

public class GenericConstructors {
    private double value;

    // Generic constructor accepting any Number type
    public <T extends Number> GenericConstructors(T arg) {
        value = arg.doubleValue(); // Convert to double
    }

    public void show() {
        System.out.println("Converted Value: " + value);
    }
}
