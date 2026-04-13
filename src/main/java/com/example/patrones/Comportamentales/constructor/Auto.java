package com.example.patrones.Comportamentales.constructor;

// clase con patron Builder real GOF, con instancia aplicada y un poco mas simple
class Auto {
    private String marca;
    private int anio;
    private String modelo;

    public static AutoBuilder autoBuilder() {
        return new AutoBuilder();
    }

    public static class AutoBuilder {
        private Auto auto = new Auto();

        public AutoBuilder marca(String marca) {
            auto.marca = marca;
            return this;
        }

        public AutoBuilder anio(int anio) {
            auto.anio = anio;
            return this;
        }

        public AutoBuilder modelo(String modelo) {
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