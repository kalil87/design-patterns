package com.example.patrones.estructurales.adaptador;

//clase que usa el servicio
public class RealizarPago {
    private ServicioDePago servicio;

    public RealizarPago(ServicioDePago servicio) {
        this.servicio = servicio;
    }

    public void pagar(double cantidad) {
        servicio.pagar(cantidad);
    }
}