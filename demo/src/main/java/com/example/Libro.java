package com.example;

public class Libro extends Material {
    private String isbn;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 5000;
        double recargoPagina = 0.01;
        return diasPrestamo * (tarifaBase + Math.max(0, numeroPaginas - 500) * recargoPagina);
    }

    public void mostrarDetallesLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}