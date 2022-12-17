package com.pgc;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class Solucion {
    public void main() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(2, new ListNode(2, new ListNode(3)));

        ListNode l = this.addTwoNumbers(l1, l2);

        printList(l);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tamanioL1 = 0;
        int tamanioL2 = 0;
        int numL1 = 0;
        int numL2 = 0;

        while (l1 != null) {
            numL1 += numL1 * Math.pow(10, tamanioL1) + l1.val;
            tamanioL1++;
            l1 = l1.next;
        }

        while (l2 != null) {
            numL2 += numL2 * Math.pow(10, tamanioL2) + l2.val;
            tamanioL2++;
            l2 = l2.next;
        }

        int val = Math.max(tamanioL1, tamanioL2);
        ListNode nodoResultado = new ListNode();
        int resultado = numL1 + numL2;

        for (int i = val; i > 0; i--) {
            insertar(Integer.parseInt(Integer.toString(resultado).substring(i - 1, i)), nodoResultado);
        }

        return nodoResultado;
    }

    public void insertar(int dato, ListNode cabeza) {
        if (cabeza == null) {
            cabeza = new ListNode(dato);
        }
        else {
            cabeza.next = new ListNode(dato);
            cabeza = cabeza.next;
        }
    }

    public void printList(ListNode tnode)
    {
        while (tnode != null)
        {
            System.out.print(tnode.val+" ");
            tnode = tnode.next;
        }
    }
}
