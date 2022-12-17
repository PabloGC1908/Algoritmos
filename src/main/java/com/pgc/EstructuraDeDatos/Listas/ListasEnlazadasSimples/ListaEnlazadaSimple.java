package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasSimples;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> cabeza = null;
    private Nodo<T> cola = null;
    private int longitudLista = 0;

    public void insertarElementoFinal(T dato){
        if (estaVacio()){
            cabeza = cola = new Nodo<>(dato, null);
        }
        else{
            cola.siguiente = new Nodo<>(dato, null);
            cola = cola.siguiente;
        }

        longitudLista++;
    }

    public void insertarElementoInicio(T dato){
        if (estaVacio()){
            cabeza = cola = new Nodo<>(dato, null);
        }
        else {
            Nodo<T> nodoNuevo = new Nodo<>(dato, null);
            nodoNuevo.siguiente = cabeza;
            cabeza = nodoNuevo;
        }

        longitudLista++;
    }

    public void eliminarElemento(T data)
    {
        Nodo<T> nodoActual = cabeza, nodoAnterior = null;

        if (nodoActual != null && nodoActual.data == data) {
            cabeza = nodoActual.siguiente;
            return;
        }

        while (nodoActual != null && nodoActual.data != data) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        }

        if (nodoActual == null)
            return;

        nodoAnterior.siguiente = nodoActual.siguiente;
        longitudLista--;
    }

    public void eliminarLista(){
        cabeza = null;
        longitudLista = 0;
    }

    public void buscarElemento(T dato){
        Nodo<T> nodoActual = cabeza;
        int i = 1;

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

    public void mostrarLista(){
        Nodo<T> nodo = cabeza;
        while (nodo != null)
        {
            System.out.print(nodo.data+" ");
            nodo = nodo.siguiente;
        }
    }

    public int tamanoLista(){
        return longitudLista;
    }

    public boolean estaVacio(){
        return tamanoLista() == 0;
    }

}
