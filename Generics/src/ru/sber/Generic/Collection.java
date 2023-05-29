package ru.sber.Generic;

public interface Collection<E> {
    int size();
    boolean isEmpty();
    boolean add(E item);
    boolean remove(E item);
    void clear();
    boolean contains(E item);
}
