package org.example;

import java.util.Scanner;

public class Cuenta {

    public String titular;
    public float cantidad;

    public Cuenta() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Titular del a cuenta: " + titular);
        System.out.println("Cantidad: $" + cantidad);
    }

    public void ingresar(float cantidadIntroducida) {
        if (cantidadIntroducida > 0) {
            cantidad += cantidadIntroducida;
        }

    }

    public void retirar(float cantidadRetiro) {
        cantidad -= cantidadRetiro;

    }

}
