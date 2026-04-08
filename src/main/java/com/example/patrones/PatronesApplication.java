package com.example.patrones;


import com.example.patrones.estructurales.adaptador.MercadoPago;
import com.example.patrones.estructurales.adaptador.MercadoPagoAdapter;
import com.example.patrones.estructurales.adaptador.RealizarPago;

public class PatronesApplication {

    public static void main(String[] args) {
        //probando el funcionamiento.
        MercadoPago mp = new MercadoPago();
        MercadoPagoAdapter mpAd = new MercadoPagoAdapter(mp);

        RealizarPago segundoPago = new RealizarPago(mpAd);

        segundoPago.pagar(100);
    }
}