package com.pgc.EstructuraDeDatos.Cola;

public class ColaCircular<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public ColaCircular() {
        frente = fin = null;
        tamanio = 0;
    }

    public void enqueue(T data) {
        Nodo<T> nodoNuevo = new Nodo<>(data, null);

        if (isEmpty()){
            frente = fin = nodoNuevo;
            frente.siguiente = frente;
        } else {
            fin.siguiente = nodoNuevo;
            fin = nodoNuevo;
            fin.siguiente = frente;
        }

        tamanio++;
    }

    public T dequeue() {
        if (isEmpty()){
            return null;
        } else {
            T dato = frente.data;
            frente = frente.siguiente;
            fin.siguiente = frente;

            tamanio--;

            return dato;
        }
    }

    public void mostrarCola() {
        Nodo<T> nodoActual = frente;

        if (nodoActual != null){
            do {
                System.out.print(nodoActual.data + " ");
                nodoActual = nodoActual.siguiente;
            } while (nodoActual != frente);
        }
        else {
            System.out.println("No hay una lista");
        }
    }

    private boolean isEmpty(){
        return tamanio == 0;
    }

    public int size(){
        return tamanio;
    }
}
