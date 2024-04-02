package com.pgc.data_structures.linkedlist;

public interface List<T> {
    void add(T data);
    void addFirst(T data);
    void addLast(T data);
    int length();
    T getHead();
    T getTail();
    void remove(T data);
    void removeFirst();
    void removeLast();
    boolean search(T data);
    void print();
}
