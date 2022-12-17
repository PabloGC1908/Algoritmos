package com.pgc.EstructuraDeDatos.Arboles.ArbolGenerico;

import java.util.ArrayList;

public class Nodo<T> {
    private T data;
    private ArrayList<Nodo<T>> hijos;

    public Nodo() {

    }

    public Nodo(T data) {
        this.data = data;
        hijos = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<Nodo<T>> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo<T>> hijos) {
        this.hijos = hijos;
    }

    public void agregarHijo(Nodo<T> hijo){
        hijos.add(hijo);
    }

    public Nodo<T> getChildAt(int index) throws IndexOutOfBoundsException {
        return hijos.get(index);
    }

    public int getNumberOfChildren() {
        return hijos.size();
    }

    public boolean hasChildren(){
        return getNumberOfChildren() > 0;
    }

    public void addChildAt(int index, Nodo<T> child) throws IndexOutOfBoundsException {
        hijos.add(index, child);
    }

    public void buscarData(T objeto) {

    }

    private void buscar(T dato, Nodo<T> nodoActual) {

    }

    public int tamanio() {
        int size = 1;
        if (hijos != null){
            for (int i = 0; i < hijos.size(); i++){
                size += getChildAt(i).tamanio();
            }
        }
        return size;
    }

    // Recorridos
    public void preOrder(){
        System.out.print(data + ", ");
        if (hijos != null){
            for (int i = 0; i < hijos.size(); i++){
                getChildAt(i).preOrder();
            }
        }
    }

    public void inOrder() {

    }

    public void posOrder() {
        if (hijos == null)
            return;

        for (int i = 0; i < hijos.size(); i++) {
            getChildAt(i).posOrder();
        }

        System.out.print(data + ", ");
    }
}
