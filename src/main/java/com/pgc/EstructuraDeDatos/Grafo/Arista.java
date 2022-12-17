package com.pgc.EstructuraDeDatos.Grafo;

public class Arista {
    public Nodo nodoDestino;
    public Arista siguiente;

    public Arista() {

    }

    @Override
    public String toString() {
        return "" + nodoDestino + " " + siguiente;
    }
}
