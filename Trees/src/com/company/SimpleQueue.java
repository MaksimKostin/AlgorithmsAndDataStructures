package com.company;

import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public void add(T element) {
        arrayList.add(element);
    }

    @Override
    public T remove() {
        return arrayList.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
