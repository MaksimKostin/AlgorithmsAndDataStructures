package com.company;

public interface Stack<T> {
    void push(T element);
    T pop();

    boolean isEmpty();
}
