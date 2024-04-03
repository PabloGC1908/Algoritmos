package com.pgc.data_structures.linkedlist;

import com.pgc.data_structures.common.simple.Node;

public class LinkedList<T> implements List<T> {
    private int length = 0;
    private Node<T> head;
    private Node<T> tail;

    public LinkedList(){
        this.head = null;
    }

    public LinkedList(T data) {
        this.head = new Node<>(data);
        this.length++;
    }


    @Override
    public int length() {
        return length;
    }

    @Override
    public void add(T data) {
        addLast(data);
    }

    public void add(T data, int pos) {
        if (pos < 0 && pos > length) {
            throw new NullPointerException();
        }

        Node<T> node = head;
        Node<T> prevNode = node;
        for (int i = 0; i < pos; i++) {
            prevNode = node;
            node = node.next;
        }

        Node<T> newNode = new Node<>(data);

        prevNode.next = newNode;
        newNode.next = node;

        length++;
    }

    @Override
    public void addLast(T data) {
        if (head != null && tail != null) {
            Node<T> node = new Node<>(data);
            tail.next = node;
            tail = node;
        } else {
            head = tail = new Node<>(data);
        }

        length++;
    }

    public void addFirst(T data){
        if (head != null && tail != null) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        } else {
            head = tail = new Node<>(data);
        }

        length++;
    }

    @Override
    public T getHead() {
        return head.data;
    }

    @Override
    public T getTail() {
        return tail.data;
    }

    @Override
    public void remove(T data) {
        Node<T> node = head;
        Node<T> prevNode = null;

        while (node != null) {
            if (node.data.equals(data)) {
                assert prevNode != null;
                prevNode.next = node.next;
            }

            prevNode = node;
            node = node.next;
        }

        length--;
    }

    @Override
    public void removeFirst() {
        head = head.next;
    }

    @Override
    public void removeLast() {
        Node<T> last = head;
        Node<T> prev = null;

        while (last.next != null) {
            prev = last;
            last = last.next;
        }

        assert prev != null;
        prev.next = null;
    }

    @Override
    public boolean search(T data) {
        Node<T> node = head;
        while (node != null) {
            if (node.data.equals(data)) {
                return true;
            }

            node = node.next;
        }

        return false;
    }

    @Override
    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
