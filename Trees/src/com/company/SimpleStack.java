package com.company;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T>{
    private ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public void push(T element) {
        arrayList.add(0, element);
    }

    @Override
    public T pop() {
        return arrayList.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
