package com.pgc.EstructuraDeDatos.Cola;

public class ColaCircularEstatica {
    private int[] tamanioMaximo;
    private int frente;
    private int fin;
    private int tamanioCola;


    public ColaCircularEstatica(int tamanioMaximo) {
        this.tamanioMaximo = new int[tamanioMaximo];
        frente = fin = 0;
        tamanioCola = 0;
    }

    public void encolar(int dato) {

    }

    public void decolar() {

    }

    private boolean estaVacio(){
        return tamanioCola == 0;
    }

    private boolean estaLleno() {
        return tamanioCola == tamanioMaximo.length;
    }

    private int tamanio() {
        return tamanioCola;
    }
}
