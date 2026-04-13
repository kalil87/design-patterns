package com.example.patrones.Comportamentales.constructor;

// Fluent Interface puro (sin patron Builder)
class Animal {
    private String tipo;
    private int edad;
    private String habitat;

    public Animal tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Animal edad(int edad) {
        this.edad = edad;
        return this;
    }

    public Animal habitat(String habitat) {
        this.habitat = habitat;
        return this;
    }

    public void mostrarDatos() {
        System.out.println("tipo: " + tipo);
        System.out.println("edad: " + edad);
        System.out.println("habitat: " + habitat + "\n");
    }
}