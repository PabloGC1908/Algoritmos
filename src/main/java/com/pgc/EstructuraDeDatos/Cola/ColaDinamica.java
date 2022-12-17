package com.pgc.EstructuraDeDatos.Cola;

public class ColaDinamica<T> {
    private Nodo<T> ultimoItem = null;
    private Nodo<T> primerItem = null;
    private int tamanioCola = 0;

    public void enqueue(T dato){
        if (estaVacio()){
            ultimoItem = primerItem = new Nodo<>(dato, null);
        }
        else {
            Nodo<T> nodoNuevo = new Nodo<>(dato, null);
            nodoNuevo.siguiente = primerItem;
            primerItem = nodoNuevo;
        }

        tamanioCola++;
    }

    public T dequeue(){
        Nodo<T> nodoRemovido = null;

        return nodoRemovido.data;
    }

    public T itemFinal(){
        return ultimoItem.data;
    }

    public T itemInicial(){
        return primerItem.data;
    }

    public boolean estaVacio(){
        return tamanioCola == 0;
    }

    public int tamanioCola() {
        return tamanioCola;
    }


}
