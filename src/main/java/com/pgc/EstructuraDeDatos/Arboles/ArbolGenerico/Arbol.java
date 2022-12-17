package com.pgc.EstructuraDeDatos.Arboles.ArbolGenerico;

public class Arbol<T> {
    private Nodo<T> raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Arbol(T data) {
        raiz = new Nodo<>(data);
    }

    public int tamanio() {
        return raiz.tamanio();
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public void buscar(T object) {
        Nodo<T> nodo = find(object);

        if (nodo != null)
            System.out.println("El objeto " + nodo + " se encuentra en el arbol");
        else
            System.out.println("No se encontro el objeto.");
    }

    public Nodo<T> find(T dataToFind) {
        Nodo<T> returnNode = null;

        if(raiz != null) {
            returnNode = auxiliaryFind(raiz, dataToFind);
        }

        return returnNode;
    }

    private Nodo<T> auxiliaryFind(Nodo<T> currentNode, T dataToFind) {
        Nodo<T> returnNode = null;
        int i = 0;

        if (currentNode.getData().equals(dataToFind)) {
            returnNode = currentNode;
        }

        else if(currentNode.hasChildren()) {
            i = 0;
            while(returnNode == null && i < currentNode.getNumberOfChildren()) {
                returnNode = auxiliaryFind(currentNode.getChildAt(i), dataToFind);
                i++;
            }
        }

        return returnNode;
    }

    public void preOrder() {
        raiz.preOrder();
    }

    public void inOrder() {
        raiz.inOrder();
    }

    public void posOrder() {
        raiz.posOrder();
    }
}
