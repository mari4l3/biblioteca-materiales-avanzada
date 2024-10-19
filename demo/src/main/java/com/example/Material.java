package com.example;

public abstract class Material {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected boolean disponible;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponible: " + disponible);
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public abstract String getTipoMaterial();

    public abstract double calcularTarifaPrestamo(int diasPrestamo);
}