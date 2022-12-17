package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasDobles;

public class Nodo<T> {
    public T data;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;

    public Nodo(T data, Nodo<T> anterior, Nodo<T> siguiente) {
        this.data = data;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
}
