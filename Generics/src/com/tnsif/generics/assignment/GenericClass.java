package com.tnsif.generics.assignment;

public class GenericClass<T> {
    private T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return this.data;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}
