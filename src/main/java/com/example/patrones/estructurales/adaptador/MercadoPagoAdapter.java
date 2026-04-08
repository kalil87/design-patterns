package com.example.patrones.estructurales.adaptador;

import java.math.BigDecimal;

//clase que sirve para adaptar la libreria a nuestro servicio RealizarPago.
public class MercadoPagoAdapter implements ServicioDePago{
    private MercadoPago mp;

    public MercadoPagoAdapter(MercadoPago mp) {
        this.mp = mp;
    }

    public void pagar(double precio) {
        BigDecimal valor = BigDecimal.valueOf(precio);
        mp.payWithMp(valor);
    }
}