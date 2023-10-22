package com.pgc.LinkedList;

public class LinkedList<T> {
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

    public int length() {
        return length;
    }
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

    private void addLast(T data) {
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

    public T getHead() {
        return head.data;
    }

    public T getTail() {
        return tail.data;
    }

    public void remove(T data) {
        Node<T> node = head;
        Node<T> prevNode = node;

        while (node != null) {
            if (node.data.equals(data)) {
                prevNode.next =
            }
        }

        length--;
    }

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

    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
