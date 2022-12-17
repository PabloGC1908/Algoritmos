package com.pgc;

public class Curso {
    private int codigo;
    private String nombre;
    private String profesor;
    private int cantidadAlumnos;

    public Curso(int codigo, String nombre, String profesor, int cantidadAlumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()) {
            return false;
        }

        Curso curso = (Curso) obj;
        return this.getCodigo() == curso.getCodigo();
    }

    @Override
    public String toString() {
        return String.format("%d %50s %26s %10d", getCodigo(), getNombre(), getProfesor(), getCantidadAlumnos());
    }
}
