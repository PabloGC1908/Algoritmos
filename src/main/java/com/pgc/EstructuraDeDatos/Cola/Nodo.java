package com.pgc.EstructuraDeDatos.Cola;

public class Nodo<T> {
    public T data;
    public Nodo<T> siguiente;

    public Nodo(T data, Nodo<T> siguiente) {
        this.data = data;
        this.siguiente = siguiente;
    }
}
