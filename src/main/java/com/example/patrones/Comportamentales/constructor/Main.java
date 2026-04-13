package com.example.patrones.Comportamentales.constructor;

public class Main {
    public static void main(String[] args) {
        Persona objetoPersona = new Persona.Builder()
                .nombre("Juan")
                .edad(30)
                .direccion("Caba")
                .build();

        objetoPersona.mostrarDatos();

        Animal objetoAnimal = new Animal();

        objetoAnimal.tipo("Tigre")
                .edad(5)
                .habitat("Selva");

        objetoAnimal.mostrarDatos();

        Auto objetoAuto = Auto.builder()
                .marca("Volkswagen")
                .anio(2016)
                .modelo("Polo")
                .build();

        objetoAuto.mostrarDatos();

        Auto objetoAuto2 = Auto.builder()
                .marca("Toyota")
                .modelo("Yaris")
                .build();

        objetoAuto2.mostrarDatos();
    }
}