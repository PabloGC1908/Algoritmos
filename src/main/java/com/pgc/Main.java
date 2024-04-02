package com.pgc;

import com.pgc.data_structures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5, 4);

        linkedList.print();

        linkedList.removeFirst();

        System.out.println();
        linkedList.print();

        System.out.println();
        linkedList.removeLast();
        linkedList.print();

        System.out.println();
        linkedList.remove(3);
        linkedList.print();

        System.out.println();
        linkedList.remove(4);
        linkedList.print();
    }
}