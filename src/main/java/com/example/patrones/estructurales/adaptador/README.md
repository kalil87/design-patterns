# 💳 Patron Adapter en Java

Ejemplo simple del patrón **Adapter** usando un caso real: integrar un sistema de pagos externo (tipo MercadoPago) a nuestra aplicación.

---

## 🧠 ¿Qué problema resuelve?

A veces queremos usar una librería externa, pero:

- ❌ No tiene la misma interfaz que nuestro código
- ❌ No podemos modificarla (porque es de terceros)

👉 Entonces necesitamos **adaptarla**.

---

## 🔌 ¿Qué es el Adapter?

El patrón **Adapter** actúa como un **traductor** entre dos clases incompatibles.

💡 Ejemplo real:  
Un enchufe europeo en un tomacorriente argentino → necesitás un adaptador ⚡

---

## 🧩 Estructura del ejemplo

Tenemos:

### 1. 🎯 Interfaz objetivo

```java
public interface ServicioDePago {
    void pagar(double cantidad);
}
```
👉 Es lo que nuestra app espera usar.

### 2. 🧠 Clase que usa el servicio

```java
   public class RealizarPago {
   private ServicioDePago servicio;

   public RealizarPago(ServicioDePago servicio) {
   this.servicio = servicio;
   }

   public void pagar(double cantidad) {
   servicio.pagar(cantidad);
   }
   }
```
👉 Nuestra app no sabe nada de MercadoPago.

### 3. 🔒 Librería externa no modificable (fake class)

```java
   public class MercadoPago {
   public void payWithMp(BigDecimal cantidad) {
   System.out.println("pagando: $" + cantidad);
   }
   }
```
👉 Tiene otra forma de trabajar (BigDecimal y otro nombre de método).

### 4. 🔧 Adapter (la clave 🔥)

```java
   public class MercadoPagoAdapter implements ServicioDePago {
   private MercadoPago mp;

   public MercadoPagoAdapter(MercadoPago mp) {
   this.mp = mp;
   }

   public void pagar(double precio) {
   BigDecimal valor = BigDecimal.valueOf(precio);
   mp.payWithMp(valor);
   }
   }
 ```
👉 Traduce:

`double → BigDecimal`

`pagar() → payWithMp()`

### 5. 🚀 Uso

```java
   public class Main {
   public static void main(String[] args) {
   MercadoPago mp = new MercadoPago();
   MercadoPagoAdapter mpAd = new MercadoPagoAdapter(mp);

        RealizarPago pago = new RealizarPago(mpAd);
        pago.pagar(1000);
   }
   }
```

## 🔄 Flujo completo

`RealizarPago → ServicioDePago → Adapter → MercadoPago`

👉 La app nunca depende directamente de la librería externa 💪

## ✅ Ventajas

✔ Desacopla tu código de librerías externas

✔ Permite cambiar implementaciones fácilmente

✔ Hace tu código más flexible y mantenible

## 🧠 Idea clave

“El Adapter permite que dos clases incompatibles trabajen juntas sin modificarlas.”

## 🚀 Bonus

Podrías agregar otro adapter en el futuro:

- StripeAdapter

- PayPalAdapter

👉 Y RealizarPago seguiría funcionando igual 😎

## 👤 Autor
GitHub: https://github.com/kalil87

Proyecto de práctica de patrones de diseño en Java ☕