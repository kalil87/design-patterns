package com.example.patrones.estructurales.adaptador;

import java.math.BigDecimal;

//Fake class que simula un SDK externo(librerías, documentación y ejemplos).
//No se puede modificar ya que no es de nuestra propiedad.
public class MercadoPago {

    public void payWithMp(BigDecimal cantidad) {
        System.out.println("pagando: $" + cantidad);
    }
}