package com.pgc.EstructuraDeDatos.Grafo;

public class Nodo<T> {
    public T data;
    public Nodo<T> siguiente;
    public Arista adyacente;

    public Nodo() {

    }

    public Nodo(T data) {
        this.data = data;
        siguiente = null;
        adyacente = null;
    }

    @Override
    public String toString() {
        String resultado = "" + data;

        while (this.siguiente != null) {
            resultado += this.siguiente.data;
        }

        return resultado;
    }
}
