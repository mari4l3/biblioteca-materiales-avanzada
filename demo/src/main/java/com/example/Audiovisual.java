package com.example;

public class Audiovisual extends Material {
    private String formato;
    private int duracion;


    public Audiovisual(String titulo, String autor, int añoPublicacion, String formato, int duracion) {
        super(titulo, autor, añoPublicacion);
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String getTipoMaterial() {
        return "Audiovisual";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 2000;
        double recargoBluRay = 1.0;
        return diasPrestamo * (tarifaBase + (formato.equalsIgnoreCase("Blu-ray") ? recargoBluRay : 0));
    }

    public void mostrarDetallesAudiovisual() {
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion + " minutos");
    }
}