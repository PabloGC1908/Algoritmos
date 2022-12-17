package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasSimples;

public class ListaCircularSimple<T> {
    private Nodo<T> cabeza = null;
    private Nodo<T> cola = null;
    private int tamanioLista = 0;


    public void insertarElemInicio(Nodo<T> nodo){
        if (estaVacio()){
            cabeza = cola = nodo;
            nodo.siguiente = cabeza;
        }
        else {
            nodo.siguiente = cabeza;
            cabeza = nodo;
            cola.siguiente = cabeza;
        }

        tamanioLista++;
    }

    // TODO
    public void insertarElemFinal(Nodo<T> nodo){
        if (estaVacio()){
            cabeza = cola = nodo;
            cabeza.siguiente = cabeza;
        }
        else {
            cola.siguiente = nodo;
            cola = nodo;
            cola.siguiente = cabeza;
        }

        tamanioLista++;
    }

    // TODO
    public void insertarElementoPosicion(Nodo<T> nodo, int posicion){
        if (posicion < 0 && posicion > tamanioLista){
            System.out.println("Posicion erronea");
            return;
        }
        if (posicion == 0){
            insertarElemInicio(nodo);
            return;
        }
        if (posicion == tamanioLista){
            insertarElemFinal(nodo);
            return;
        }


        Nodo<T> nodoActual = cabeza;
        for (int i = 0; i < posicion - 1; i++){
            nodoActual = nodoActual.siguiente;
        }
        nodo.siguiente = nodoActual.siguiente;
        nodoActual.siguiente = nodo;

        tamanioLista++;
    }

    public void eliminarNodo(Nodo<T> nodo){
        Nodo<T> nodoActual = cabeza, nodoAnterior = null;

        if (nodoActual.equals(nodo)){
            cabeza = nodo.siguiente;
            return;
        }

        while (nodoActual != null && !nodoActual.equals(nodo)){
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        }

        if (nodoActual == null || nodoAnterior == null)
            return;

        nodoAnterior.siguiente = nodoActual.siguiente;
        tamanioLista--;
    }

    public void buscarElemento(T dato){
        Nodo<T> nodoActual = cabeza;
        int i = 0;

        if (dato != null) {
            while (nodoActual != null) {
                if (nodoActual.data.equals(dato)) {
                    System.out.println(dato);
                    System.out.println("Indice del dato: " + i);
                    return;
                }

                nodoActual = nodoActual.siguiente;
                i++;
            }
            System.out.println("Dato no encontrado");
        }
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

    public int tamanioLista(){
        return tamanioLista;
    }
}
