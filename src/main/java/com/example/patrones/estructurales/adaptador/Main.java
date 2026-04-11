package com.example.patrones.estructurales.adaptador;

public class Main {
    public static void main(String[] args) {
        //probando el funcionamiento.
        MercadoPago mp = new MercadoPago();
        MercadoPagoAdapter mpAd = new MercadoPagoAdapter(mp);

        RealizarPago segundoPago = new RealizarPago(mpAd);

        segundoPago.pagar(1000);
    }
}