package com.example.patrones.Comportamentales.constructor;

// clase con patron Builder real GOF, el clasico
class Persona {
    private String nombre;
    private Integer edad;
    private String direccion;

    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
    }
    public static class Builder {
        private String nombre;
        private Integer edad;
        private String direccion;


        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder edad(Integer edad) {
            this.edad = edad;
            return this;
        }

        public Builder direccion(String direccion) {
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