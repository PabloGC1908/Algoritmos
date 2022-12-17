package com.pgc.EstructuraDeDatos.Grafo;

import java.util.LinkedList;
import java.util.List;

// Version de un grafo con listas adyacentes
public class Grafo<T> {
    private int tamanioAristas;
    private int tamanioVertices;
    private LinkedList<Integer>[] listaAdyacencia;


    public Grafo(int tamanioVertices) {
        this.tamanioVertices = tamanioVertices;
        tamanioAristas = 0;

        for (int i = 0; i < tamanioVertices; i++) {
            listaAdyacencia[i] = new LinkedList<>();
        }
    }

    // Inserta un vertice al grafo
    public void insertarVertice(Nodo<T> vertice) {

        tamanioVertices++;
    }

    // Elimina una vertice y sus aristas adyacentes a esta
    public void eliminarVertice(Nodo<T> vertice) {
        tamanioVertices--;
    }

    // Añade una arista entre dos nodos
    public void insertarArista(int v1, int v2) {
        listaAdyacencia[v1].add(v2);
        listaAdyacencia[v2].add(v1);
        tamanioAristas++;
    }

    public void eliminarArista() {
        tamanioAristas--;
    }


    // Retorna el numero de vertices en el grafo
    public int verticesSize() {
        return tamanioVertices;
    }

    // Retorna el numero de aristas en el grafo
    public int aristasSize() {
        return tamanioAristas;
    }

    public Iterable<T> adjacent(T v) {
        return null;
    }

    @Override
    public String toString() {
        return listaAdyacencia.toString();
    }

}
