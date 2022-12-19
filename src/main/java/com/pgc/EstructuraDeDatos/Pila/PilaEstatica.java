package com.pgc.EstructuraDeDatos.Pila;

public class PilaEstatica {
    private final Object[] tamanioPila;
    private int tope = -1;

    public PilaEstatica(int tamanioPila) {
        this.tamanioPila = new Object[tamanioPila];
    }

    public PilaEstatica() {
        tamanioPila = new Object[10];
    }

    public void push(Object data) {

    }

    public Object pop() {
        return null;
    }

    public Object tope() {
        return null;
    }

    public Object bottom() {
        return null;
    }

    public int tamanio() {
        return tamanioPila.length;
    }

    public boolean estaVacio() {
        return tope == -1;
    }

    public boolean estaLleno() {
        return tope == tamanioPila.length - 1;
    }
}
