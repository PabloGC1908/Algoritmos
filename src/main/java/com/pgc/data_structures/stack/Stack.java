package com.pgc.data_structures.stack;

import com.pgc.data_structures.common.simple.Node;

public class Stack<T> {
    private int length = 0;
    private Node<T> head;

    public Stack() {
    }

    public void push(T data) {
        if (head != null) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        } else {
            head = new Node<>(data);
        }

        length++;
    }

    public void pop() {
        head = head.next;
    }

    public T top() {
        return head.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }
}
