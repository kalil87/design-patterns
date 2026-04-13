package com.example.patrones.Comportamentales.constructor;

// clase con patron Builder real GOF, Builder moderno (fluent builder)
class Auto {
    private String marca;
    private Integer anio;
    private String modelo;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Auto auto = new Auto();

        public Builder marca(String marca) {
            auto.marca = marca;
            return this;
        }

        public Builder anio(Integer anio) {
            auto.anio = anio;
            return this;
        }

        public Builder modelo(String modelo) {
            auto.modelo = modelo;
            return this;
        }

        public Auto build() {
            return auto;
        }
    }

    public void mostrarDatos() {
        System.out.println("marca: " + marca);
        System.out.println("año: " + anio);
        System.out.println("modelo: " + modelo + "\n");
    }
}