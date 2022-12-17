package com.pgc.EstructuraDeDatos.Pila;

public class Nodo<T> {
    public T data;
    public Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(T data, Nodo<T> siguiente) {
        this.data = data;
        this.siguiente = siguiente;
    }
}
