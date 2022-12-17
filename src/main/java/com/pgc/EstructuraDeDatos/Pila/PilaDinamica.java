package com.pgc.EstructuraDeDatos.Pila;

public class PilaDinamica<T> {
    private Nodo<T> tope;
    private Nodo<T> bottom;
    private int tamanioPila = 0;

    public PilaDinamica() {
    }

    public void push(Nodo<T> nodo) {
        if (!estaVacio()) {
            nodo.siguiente = tope;
        }
        tope = bottom = nodo;

        tamanioPila++;
    }

    public void push(T data) {
        Nodo<T> nodo = new Nodo<>(data, null);
        if (!estaVacio()) {
            nodo.siguiente = tope;
        }
        tope = bottom = nodo;

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
        return bottom.data;
    }

    public int tamanioPila() {
        return tamanioPila;
    }

    public boolean estaVacio() {
        return tamanioPila == 0;
    }
}
