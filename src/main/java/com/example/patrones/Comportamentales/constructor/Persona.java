package com.example.patrones.Comportamentales.constructor;

// clase con patron Builder real GOF
class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    private Persona(PersonaBuilder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
    }
    public static class PersonaBuilder {
        private String nombre;
        private int edad;
        private String direccion;


        public PersonaBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PersonaBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public PersonaBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }
    }

    public void mostrarDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("direccion: " + direccion + "\n");
    }
}