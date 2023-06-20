package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cuenta cuenta= new Cuenta();

        System.out.println("Ingrese su nombre");
        Scanner teclado2 = new Scanner(System.in);
        cuenta.setTitular(teclado2.nextLine()) ;



        System.out.println("Ingrese la cantidad : ");
        Scanner teclado = new Scanner(System.in);
        float cantidadIntroducida = teclado.nextFloat();

        System.out.println("Cantidad a retirar");
        Scanner teclado1 = new Scanner(System.in);
        float cantidadRetiro = teclado1.nextFloat();

        cuenta.ingresar(cantidadIntroducida);
        cuenta.retirar(cantidadRetiro);
        cuenta.mostrar();



    }
}