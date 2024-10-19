package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.agregarMaterial(new Libro("El resplandor", "Stephen King", 1989, "978-1234-5678-9012", 650));
        

        biblioteca.agregarMaterial(new Revista("El mundo de los muertos", "Stephen King", 1989, 1, "Mayo"));

        biblioteca.agregarMaterial(new Audiovisual("Salem's Lot", "Stephen King", 1989, "DVD", 100));

        

    }
}