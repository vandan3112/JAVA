package com.tnsif.generics.assignment_3;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
