package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasDobles;

public class ListaCircularDoble<T> {
    private Nodo<T> cabeza = null;
    private Nodo<T> cola = null;
    private int tamanioLista = 0;

    public void insertarElementoInicio(Nodo<T> nodo){
        if (estaVacio()){
            nodo.anterior = nodo.siguiente = nodo;
            cabeza = nodo;
        }
        else {
            cola = cabeza.anterior;
        }

        tamanioLista++;
    }

    public void insertarElementoFinal(Nodo<T> nodo){
        if (estaVacio()){
            nodo.siguiente = nodo.anterior = nodo;
            cabeza = nodo;
        }
        else {
            cola = cabeza.anterior;
            nodo.siguiente = cabeza;
            cabeza.anterior = nodo;
            nodo.anterior = cola;
            cola.siguiente = nodo;
        }

        tamanioLista++;
    }

    public void insertarElementoEnPosicion(Nodo<T> nodo, int posicion){
        if (posicion < 0 || posicion > tamanioLista){
            System.out.println("Posicion erronea");
            return;
        }

        if (posicion == 0){
            insertarElementoInicio(nodo);
            return;
        }

        if (posicion == tamanioLista){
            insertarElementoFinal(nodo);
            return;
        }

        Nodo<T> nodoTemporal = cabeza;
        for (int i = 0; i < posicion - 1; i++){
            nodoTemporal = nodoTemporal.siguiente;
        }

        nodo.siguiente = nodoTemporal.siguiente;
        nodo.anterior = nodoTemporal;
        nodoTemporal.siguiente.anterior = nodo;
        nodoTemporal.siguiente = nodo;

        tamanioLista++;
    }

    public void eliminarElementoInicio(){
        if (estaVacio()){
            System.out.println("Lista Vacia..");
            return;
        }

        cabeza = cabeza.siguiente;
        cabeza.anterior = cola;

        tamanioLista--;
    }

    public void eliminarElementoFinal(){
        if (estaVacio()){
            System.out.println("Lista vacia..");
            return;
        }

        cola = cola.anterior;
        cola.siguiente = cabeza;

        tamanioLista--;
    }

    public void eliminarElemento(Nodo<T> nodo){
        tamanioLista--;
    }

    public boolean estaVacio(){
        return tamanioLista == 0;
    }

    public void mostrarLista(){
        Nodo<T> nodoActual = cabeza;

        if (nodoActual != null){
            do {
                System.out.print(nodoActual.data + " ");
                nodoActual = nodoActual.siguiente;
            } while (nodoActual != cabeza);
        }
        else {
            System.out.println("No hay una lista");
        }
    }


}
