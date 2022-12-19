package com.pgc.EstructuraDeDatos.Pila;

public class PilaDinamica<T>{
    private Nodo<T> tope;
    private Nodo<T> ultimo;
    private int tamanioPila = 0;

    public PilaDinamica() {
    }

    public void push(Nodo<T> nodo) {
        if (!this.isEmpty()) {
            nodo.siguiente = tope;
        }
        tope = ultimo = nodo;

        tamanioPila++;
    }

    public void push(T data) {
        Nodo<T> nodo = new Nodo<>(data, null);
        if (!this.isEmpty()) {
            nodo.siguiente = tope;
        }
        tope = ultimo = nodo;

        tamanioPila++;
    }

    public T pop() {
        if (tope == null) {
            return null;
        }
        else {
            T data = tope.data;
            tope = tope.siguiente;

            tamanioPila--;
            return data;
        }
    }

    public T peek() {
        return tope.data;
    }

    public T bottom() {
        return ultimo.data;
    }

    public int tamanio() {
        return tamanioPila;
    }

    public boolean isEmpty() {
        return tamanioPila == 0;
    }
}
