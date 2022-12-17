package com.pgc.EstructuraDeDatos.Arboles.ArbolBinario;

public class Nodo<T> {
    public T data;
    public Nodo<T> izquierda;
    public Nodo<T> derecha;

    public Nodo(T data, Nodo<T> izquierda, Nodo<T> derecha) {
        this.data = data;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
}
