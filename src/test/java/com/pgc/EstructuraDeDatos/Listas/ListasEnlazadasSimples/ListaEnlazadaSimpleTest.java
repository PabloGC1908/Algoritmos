package com.pgc.EstructuraDeDatos.Listas.ListasEnlazadasSimples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test: Lista enlazada simple")
class ListaEnlazadaSimpleTest {
    private final ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();


    @Test
    void insertar() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertEquals(4, lista.tamanio());
    }

    @Test
    void insertarFinal() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);



        assertEquals(4, lista.eliminarFinal());
        assertEquals(3, lista.eliminarFinal());
    }

    @Test
    void insertarInicio() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertEquals(1, lista.eliminarInicio()); // Lista queda: 2 -> 3 -> 4
        assertEquals(2, lista.eliminarInicio()); // Lista queda: 3 -> 4
        assertEquals(3, lista.eliminarInicio());
        assertEquals(4, lista.eliminarInicio());
        assertNull(lista.eliminarInicio());
    }

    @Test
    void eliminar() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.eliminar(3);

        assertEquals("1 2 4 ", lista.mostrar());

    }

    @Test
    void eliminarInicio() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertEquals(1, lista.eliminarInicio());
        assertEquals(2, lista.eliminarInicio());
    }

    @Test
    void eliminarFinal() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertEquals(4, lista.eliminarFinal());
        assertEquals(3, lista.eliminarFinal());
    }

    @Test
    void eliminarLista() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.eliminarLista();

        assertEquals(0, lista.tamanio());
    }

    @Test
    void buscar() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertTrue(lista.buscar(3));
        assertFalse(lista.buscar(5));
    }

    @Test
    void mostrar() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertEquals("1 2 3 4 5", lista.mostrar());
    }

    @Test
    void tamanio() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertEquals(4, lista.tamanio());
    }

    @Test
    void estaVacio() {
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        assertFalse(lista.estaVacio());
    }
}