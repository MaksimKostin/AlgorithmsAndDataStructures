package com.company;

public interface Queue<T> {
    void add(T element); // добавить элемент в конец очереди
    T remove(); // извлечь первый элемент и удалить его из очереди

    boolean isEmpty();
}
