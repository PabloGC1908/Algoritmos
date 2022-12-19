package com.pgc.EstructuraDeDatos.Cola;

public class ColaDinamica<T> {
    private Nodo<T> final_;
    private Nodo<T> frente;
    private int tamanioCola;

    public ColaDinamica() {
        frente = final_ = null;
        tamanioCola = 0;
    }

    public void encolar(T dato){
        if (isEmpty()){
            final_ = frente = new Nodo<>(dato, null);
        }
        else {
            Nodo<T> nodoNuevo = new Nodo<>(dato, null);
            nodoNuevo.siguiente = final_;
            final_ = nodoNuevo;
        }

        tamanioCola++;
    }

    public T decolar(){
        T data;
        if (frente == null) {
            return null;
        }
        else {
            Nodo<T> nodoRemovido = frente;
            data = frente.data;

        }

        tamanioCola--;
        return data;
    }

    public T elegirFinal(){
        return final_.data;
    }

    public T peekFrente(){
        return frente.data;
    }

    public boolean isEmpty(){
        return tamanioCola == 0;
    }

    public int tamanio() {
        return tamanioCola;
    }


}
