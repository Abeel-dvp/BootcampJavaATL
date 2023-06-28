package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el capital Inicial: ");
        float inicial = teclado.nextFloat();
        System.out.println("Ingrese la Adicion Anual: ");
        float adicionAnual = teclado.nextFloat();
        System.out.println("Ingrese la cantidad de Años: ");
        float cantidadAnos = teclado.nextFloat();
        System.out.println("Ingrese la tasa de interes (%): " );
        float tasaInteres = teclado.nextFloat();

        float cantidadFinal = inicial;

        for (int i = 0 ; i<cantidadAnos; i++){
            cantidadFinal += adicionAnual;
            cantidadFinal += cantidadFinal * tasaInteres /100;
        }
        System.out.println("Al finalizar vas a tener: "+ cantidadFinal);
    }
}