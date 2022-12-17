package com.pgc.EstructuraDeDatos.Arboles.ArbolBinario;

import com.pgc.EstructuraDeDatos.Arboles.Recorridos;

public class ArbolBinario<T extends Comparable<T>> {
    private int tamanioNodos = 0;
    private Nodo<T> raiz = null;




    // Metodo Insertar
    public boolean insertar(T data) {

        // Revisa si el dato ya esta añadido al arbol, si esta el dato en el arbol ignora el dato a agregar
        if (contiene(data)) {
            return false;

        // Si el dato no esta lo agrega
        } else {
            raiz = insertarNodo(data, raiz);
            tamanioNodos++;
            return true;
        }
    }
    
    private Nodo<T> insertarNodo(T data, Nodo<T> nodo) {
        if (nodo == null) {
            nodo = new Nodo<>(data, null, null);
        } else {
            if (data.compareTo(nodo.data) < 0) {
                nodo.izquierda = insertarNodo(data, nodo.izquierda);
            } else {
                nodo.derecha = insertarNodo(data, nodo.derecha);
            }
        }

        return nodo;
    }

    // Metodo Contiene

    public boolean contiene(T data) {
        return contiene(data, raiz);
    }

    // Metodo Eliminar

    public boolean eliminarData(T data) {

        // Make sure the node we want to remove
        // actually exists before we remove it
        if (contiene(data)) {
            raiz = remove(data, raiz);
            tamanioNodos--;
            return true;
        }
        return false;
    }

    private boolean contiene(T data, Nodo<T> nodo) {

        // Base case: reached bottom, value not found
        if (nodo == null) return false;

        int cmp = data.compareTo(nodo.data);

        // Dig into the left subtree because the value we're
        // looking for is smaller than the current value
        if (cmp < 0) return contiene(data, nodo.izquierda);

            // Dig into the right subtree because the value we're
            // looking for is greater than the current value
        else if (cmp > 0) return contiene(data, nodo.derecha);

            // We found the value we were looking for
        else return true;
    }

    private Nodo<T> remove(T data, Nodo<T> nodo) {

        if (nodo == null) return null;

        int cmp = data.compareTo(nodo.data);

        // Dig into left subtree, the value we're looking
        // for is smaller than the current value
        if (cmp < 0) {
            nodo.izquierda = remove(data, nodo.izquierda);

            // Dig into right subtree, the value we're looking
            // for is greater than the current value
        } else if (cmp > 0) {
            nodo.derecha = remove(data, nodo.derecha);

            // Found the node we wish to remove
        } else {

            // This is the case with only a right subtree or
            // no subtree at all. In this situation just
            // swap the node we wish to remove with its right child.
            if (nodo.izquierda == null) {
                return nodo.derecha;

                // This is the case with only a left subtree or
                // no subtree at all. In this situation just
                // swap the node we wish to remove with its left child.
            } else if (nodo.derecha == null) {

                return nodo.izquierda;

                // When removing a node from a binary tree with two links the
                // successor of the node being removed can either be the largest
                // value in the left subtree or the smallest value in the right
                // subtree. In this implementation I have decided to find the
                // smallest value in the right subtree which can be found by
                // traversing as far left as possible in the right subtree.
            } else {

                // Find the leftmost node in the right subtree
                Nodo<T> tmp = findMin(nodo.derecha);

                // Swap the data
                nodo.data = tmp.data;

                // Go into the right subtree and remove the leftmost node we
                // found and swapped data with. This prevents us from having
                // two nodes in our tree with the same value.
                nodo.derecha = remove(tmp.data, nodo.derecha);

                // If instead we wanted to find the largest node in the left
                // subtree as opposed to smallest node in the right subtree
                // here is what we would do:
                // Node tmp = findMax(node.left);
                // node.data = tmp.data;
                // node.left = remove(node.left, tmp.data);

            }
        }

        return nodo;
    }

    // Metodos Secundarios

    public int tamanio() {
        return tamanioNodos;
    }

    public boolean estaVacio() {
        return tamanio() == 0;
    }

    // Helper method to find the leftmost node (which has the smallest value)
    private Nodo<T> findMin(Nodo<T> nodo) {
        while (nodo.izquierda != null) nodo = nodo.izquierda;
        return nodo;
    }

    // Helper method to find the rightmost node (which has the largest value)
    private Nodo<T> findMax(Nodo<T> nodo) {
        while (nodo.derecha != null) nodo = nodo.derecha;
        return nodo;
    }

    // Computes the height of the tree, O(n)
    public int altura() {
        return altura(raiz);
    }

    // Recursive helper method to compute the height of the tree
    private int altura(Nodo<T> nodo) {
        if (nodo == null) return 0;
        return Math.max(altura(nodo.izquierda), altura(nodo.derecha)) + 1;
    }

    // Recorridos del arbol

    public void recorridos(Recorridos recorrido) {
        switch (recorrido){
            case PRE_ORDEN:
                preOrden();
                break;
            case IN_ORDEN:
                inOrden();
                break;
            case POST_ORDEN:
                postOrden();
                break;
        }
    }

    public void preOrden() {

    }

    public void inOrden() {

    }

    public void postOrden() {

    }
}
