package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasSimples;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int longitudLista;

    public ListaEnlazadaSimple() {
        cabeza = null;
        cola = null;
        longitudLista = 0;
    }

    public void insertar(T dato) {
        insertarFinal(dato);
    }

    public void insertarFinal(T dato){
        if (estaVacio()){
            cabeza = cola = new Nodo<>(dato, null);
        }
        else{
            cola.siguiente = new Nodo<>(dato, null);
            cola = cola.siguiente;
        }

        longitudLista++;
    }

    public void insertarInicio(T dato){
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

    public void eliminar(T data)
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

    public T eliminarInicio() {
        if (estaVacio()) {
            return null;
        }
        else {
            Nodo<T> nodoRemovido = cabeza;
            cabeza = nodoRemovido.siguiente;
            longitudLista--;

            return nodoRemovido.data;
        }
    }

    public T eliminarFinal() {
        if (estaVacio()) {
            return null;
        } else if (cabeza.siguiente == null) {
            T data = cabeza.data;
            cabeza = null;
            return data;
        } else {
            Nodo<T> nodoAnterior = null;
            Nodo<T> nodoActual = cabeza;

            while (nodoActual.siguiente != null){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.siguiente;
            }


            nodoAnterior.siguiente = null;
            return nodoActual.data;
        }
    }


    public void eliminarLista(){
        cabeza = null;
        longitudLista = 0;
    }

    public boolean buscar(T dato){
        Nodo<T> nodoActual = cabeza;
        int i = 1;

        if (dato != null) {
            while (nodoActual != null) {
                if (nodoActual.data.equals(dato)) {
                    return true;
                }

                nodoActual = nodoActual.siguiente;
                i++;
            }
        }

        return false;

    }

    public String mostrar(){
        StringBuilder resultado = new StringBuilder();
        Nodo<T> nodo = cabeza;
        while (nodo != null)
        {
            resultado.append(nodo.data).append(" ");
            nodo = nodo.siguiente;
        }

        return resultado.toString();
    }

    public int tamanio(){
        return longitudLista;
    }

    public boolean estaVacio(){
        return tamanio() == 0;
    }

}
