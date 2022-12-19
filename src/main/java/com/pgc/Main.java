package com.pgc;


import com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasSimples.ListaEnlazadaSimple;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();

        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);



        System.out.println(lista.eliminarFinal());
        System.out.println(lista.mostrar());
    }
}