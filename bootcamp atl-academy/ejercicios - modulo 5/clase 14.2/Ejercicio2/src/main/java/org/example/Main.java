package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el costo del producto");
        Scanner teclado = new Scanner(System.in);
        float  costoDelProducto = teclado.nextFloat();

        System.out.println("Ingrese la cantidad pagada");
        float  cantidadPagada = teclado.nextFloat();

        if (cantidadPagada < costoDelProducto){
            float loQueFalta = costoDelProducto - cantidadPagada;
            System.out.println("Falta abonar: " + loQueFalta);
            System.out.println("Saldo insuficiente para realizar esta compra!");
        } else {
            float cambioTotal = cantidadPagada - costoDelProducto;
            System.out.println("Su cambio total es: $" + cambioTotal);
        }


    }
}