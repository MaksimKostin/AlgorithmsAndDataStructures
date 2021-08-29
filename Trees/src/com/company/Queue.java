package com.company;

public interface Queue<T>{
    void add(T element);
    T remove();

    boolean isEmpty();
}
