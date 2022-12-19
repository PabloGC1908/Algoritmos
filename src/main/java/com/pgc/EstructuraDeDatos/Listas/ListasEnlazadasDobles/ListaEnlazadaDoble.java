package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasDobles;

public class ListaEnlazadaDoble<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanioLista;

    public ListaEnlazadaDoble() {
        cabeza = null;
        cola = null;
        tamanioLista = 0;
    }

    public void insertarElemento(T dato){
        insertarElementoFinal(dato);
    }

    public void insertarElementoFinal(T dato){
        if (estaVacio()){
            cabeza = cola = new Nodo<>(dato, null, null);
        }
        else {
            cola.siguiente = new Nodo<>(dato, cola, null);
            cola = cola.siguiente;
        }
        tamanioLista++;
    }

    public void insertarElementoInicio(T dato){
        if (estaVacio()){
            cabeza = cola = new Nodo<>(dato, null, null);
        }
        else {
            cabeza.anterior = new Nodo<>(dato, null, cabeza);
            cabeza = cabeza.anterior;
        }
        tamanioLista++;
    }

    public void insertarElementoEnPosicion(T dato, int posicion){
        if (posicion < 0 || posicion > tamanioLista){
            System.out.println("Posicion erronea");
            return;
        }

        if (posicion == 0){
            insertarElementoInicio(dato);
            return;
        }

        if (posicion == tamanioLista){
            insertarElementoFinal(dato);
            return;
        }

        Nodo<T> nodoTemporal = cabeza;
        for (int i = 0; i < posicion - 1; i++){
            nodoTemporal = nodoTemporal.siguiente;
        }

        Nodo<T> nodoNuevo = new Nodo<>(dato, null,null);
        nodoNuevo.siguiente = nodoTemporal.siguiente;
        nodoNuevo.anterior = nodoTemporal;
        nodoTemporal.siguiente.anterior = nodoNuevo;
        nodoTemporal.siguiente = nodoNuevo;

        tamanioLista++;
    }

    public void eliminarElementoInicio(){
        if (estaVacio()){
            System.out.println("Lista Vacia..");
            return;
        }

        cabeza = cabeza.siguiente;
        cabeza.anterior = null;
        tamanioLista--;
    }

    public void eliminarElementoFinal(){
        if (estaVacio()){
            System.out.println("Lista Vacia..");
        }

        cola = cola.anterior;
        cola.siguiente = null;
        tamanioLista--;
    }

    // TODO
    public void eliminarElemento(T dato){
        if (dato.equals(cabeza.data)){
            eliminarElementoInicio();
            return;
        }


        if (dato.equals(cola.data)){
            eliminarElementoFinal();
            return;
        }

        Nodo<T> nodoActual =  cabeza;
        while (!dato.equals(nodoActual.data)){
            nodoActual = nodoActual.siguiente;
        }

        nodoActual.siguiente.anterior = nodoActual.anterior;
        nodoActual.anterior.siguiente = nodoActual.siguiente;

        nodoActual.data = null;
        nodoActual.anterior = nodoActual.siguiente = null;

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

    public void mostrarLista() {
        while (cabeza != null)
        {
            System.out.print(cabeza.data+" ");
            cabeza = cabeza.siguiente;
        }
    }

    public boolean estaVacio(){
        return tamanioLista == 0;
    }

    public int tamanioLista(){
        return tamanioLista;
    }

}
